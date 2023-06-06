import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BubbleSortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        char option = ' '; // Option selected by the user

        // Prompt user for input option
        System.out.println("Do you want to provide the number sequence via (F)ile or (M)anually?");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            option = reader.readLine().charAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (option) {
            case 'F':
            case 'f':
                numbers = readNumbersFromFile();
                break;
            case 'M':
            case 'm':
                numbers = readNumbersFromManualInput();
                break;
            default:
                System.out.println("Invalid option selected. Exiting the program.");
                System.exit(0);
        }

        System.out.println("Original list: " + numbers);

        long startTime = System.nanoTime();

        bubbleSort(numbers);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("\nSorted list: " + numbers);
        System.out.println("\nTime taken: " + duration + " nanoseconds.");
    }

    private static LinkedList<Integer> readNumbersFromFile() {
        LinkedList<Integer> numbers = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/test4.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] numberStrings = line.split(",");

                for (String numString : numberStrings) {
                    numbers.add(Integer.parseInt(numString.trim()));
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    private static LinkedList<Integer> readNumbersFromManualInput() {
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter numbers separated by commas:");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();

            String[] numberStrings = input.split(",");

            for (String numString : numberStrings) {
                numbers.add(Integer.parseInt(numString.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    private static void bubbleSort(LinkedList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
