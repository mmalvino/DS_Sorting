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
        System.out.println("Do you want to print the sorted number sequence via text (F)ile or (M)anually?");

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

        System.out.println("\nSorted list: " + numbers);

        long duration = endTime - startTime;
        long milliseconds = duration / 1_000_000; // Convert nanoseconds to milliseconds

        System.out.println("\nTime taken: " + duration + " nanoseconds");
        System.out.println("Time taken: " + milliseconds + " milliseconds");
    }

    // Method to read numbers from a file
    private static LinkedList<Integer> readNumbersFromFile() {
        LinkedList<Integer> numbers = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/test15.txt"));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                String[] numberStrings = line.split(",");

                // Convert each number from string to int and add to the list
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

    // Method to read numbers from manual input
    private static LinkedList<Integer> readNumbersFromManualInput() {
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter numbers separated by commas:");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();

            String[] numberStrings = input.split(",");

            // Convert each number from string to int and add to the list
            for (String numString : numberStrings) {
                numbers.add(Integer.parseInt(numString.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    // Bubble sort algorithm for linked list
    private static void bubbleSort(LinkedList<Integer> list) {
        int n = list.size();

        // Outer loop for iterations
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements at indices j and j + 1
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
