import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Perform performance comparison and display results
        performComparison();
    }

    public static void performComparison() {
        // Generate input data for sorting
        int[] arrayData = {2,3,4,5,6,7,9,10,28,37,83,84,29,27,84,61,93,284};
        LinkedListNode linkedListData = generateLinkedList();

        // Print original sequence
        System.out.println("Original Array: " + Arrays.toString(arrayData));
        System.out.println("Original Linked List: " + linkedListToString(linkedListData));

        // Perform bubble sort on arrays
        int[] arrayCopy = arrayData.clone();
        long arrayStartTime = System.nanoTime();
        bubbleSort(arrayCopy);
        long arrayEndTime = System.nanoTime();
        long arrayRuntime = arrayEndTime - arrayStartTime;
        System.out.println("Sorted Array: " + Arrays.toString(arrayCopy));
        System.out.println("Array Sorting Runtime: " + arrayRuntime + " nanoseconds");

        // Perform bubble sort on linked lists
        LinkedListNode linkedListCopy = linkedListData.clone();
        long linkedListStartTime = System.nanoTime();
        bubbleSortLinkedList(linkedListCopy);
        long linkedListEndTime = System.nanoTime();
        long linkedListRuntime = linkedListEndTime - linkedListStartTime;
        System.out.println("Sorted Linked List: " + linkedListToString(linkedListCopy));
        System.out.println("Linked List Sorting Runtime: " + linkedListRuntime + " nanoseconds");
    }

    // Bubble sort implementation for arrays
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sort implementation for linked lists
    public static void bubbleSortLinkedList(LinkedListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        LinkedListNode current;
        LinkedListNode lastSorted = null;

        do {
            swapped = false;
            current = head;

            while (current.next != lastSorted) {
                if (current.data > current.next.data) {
                    // Swap nodes
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }

            lastSorted = current;
        } while (swapped);
    }

    // Helper method to generate a linked list
    public static LinkedListNode generateLinkedList() {
        LinkedListNode head = new LinkedListNode(5);
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(8);
        LinkedListNode node3 = new LinkedListNode(12);
        LinkedListNode node4 = new LinkedListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return head;
    }

    // Helper method to convert linked list to string for printing
    public static String linkedListToString(LinkedListNode head) {
        StringBuilder sb = new StringBuilder();
        LinkedListNode current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    // LinkedListNode class definition
    public static class LinkedListNode implements Cloneable {
        public int data;
        public LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public LinkedListNode clone() {
            try {
                LinkedListNode clone = (LinkedListNode) super.clone();
                if (next != null) {
                    clone.next = next.clone();
                }
                return clone;
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }
}
