public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
        prev = null;
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
