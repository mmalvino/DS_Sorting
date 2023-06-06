public class LinkedListNode implements Cloneable {
    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
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
