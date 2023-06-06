public class LinkedListBubbleSort {
    public static void bubbleSort(LinkedListNode head) {
        LinkedListNode current, index;
        int temp;
        if (head == null) {
            return;
        }
        current = head;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.value > index.value) {
                    temp = current.value;
                    current.value = index.value;
                    index.value = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}
