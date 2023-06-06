import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BubbleSortArray {
    static int[] array;

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] readArrayFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number sequence (comma-separated numbers): ");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i].trim());
        }

        return array;
    }

    private static int[] readArrayFromFile() {
        try {
            InputStream is = BubbleSortArray.class.getResourceAsStream("test4.txt");
            if (is == null) {
                System.out.println("Failed to locate the file.");
                return null;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = reader.readLine();
            String[] numbers = line.split(", ");
            int[] array = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            return array;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to provide the number sequence via (F)ile or (M)anually? ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("F")) {
            // Read array from file
            array = readArrayFromFile();
            if (array == null) {
                System.out.println("Error reading array from file.");
                return;
            }
        } else if (input.equalsIgnoreCase("M")) {
            // Read array from user input
            array = readArrayFromInput();
        } else {
            System.out.println("Invalid input. Exiting the program.");
            return;
        }

        System.out.println("Original array:");
        printArray(array);

        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();

        System.out.println("\nSorted array:");
        printArray(array);

        long duration = endTime - startTime;
        System.out.println("\nTime taken: " + duration + " nanoseconds");
    }
}
