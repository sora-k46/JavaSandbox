public class DLL {
    public Node head; 
    public Node tail;

    public DLL() {
        tail = null;
        head = null;
    }

    public DLL(Node head) {
        this.head = head;
        head.prev = null;
    }

    public DLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
        head.next = tail;
        head.prev = null;
        tail.prev = head;
        tail.next = null;
    }

    public void addToHead(Node node) {
        if(isEmpty()) {
            head = node;
            tail = node;
            tail.prev = head;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void removeAtHead() {
        if(!isEmpty()) {
            head.next.prev = null;
            head = head.next;
        }
    }

    public void addToTail(Node node) {
        if(!isEmpty()) {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void removeFromTail() {
        if(!isEmpty()) {
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
    }

    public void addAt(int i, Node node) {
        if(!isEmpty() && i > 0 && i < size()) {
            Node temp = head;
            int count = 0;
            while(temp != null) {
                if(count == i - 1) break;
                temp = temp.next;
                count++;
            }
            temp.next.prev = node;
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void removeAt(int i) {
        if(!isEmpty() && i > 0 && i < size()) {
            Node temp = head;
            int count = 0;
            while(temp != null) {
                if(count == i - 1) break;
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
            temp.next.prev.prev = null;
            temp.next.prev.next = null;
            temp.next.prev = temp;
        }
    }

    public void swapNode(int i, int j) {
        if(size() == 2) {
            tail.next = head;
            tail.prev = null;
            head.next = null;
            head.prev = tail;
            head = tail;
            return;
        }
        if(i >= 0 && j >= 0 && i < j && !isEmpty() && i < size() && j < size()) {
            int count = 0;
            Node temp = head;
            while(temp != null) {
                if(count == i - 1 || i == 0) break;
                temp = temp.next;
                count++;
            }
            Node a1 = temp;
            Node a2 = temp.next;
            Node a3 = temp.next.next;
            temp = head;
            count = 0;
            while(temp != null) {
                if(count == j - 1 || j == 0) break;
                temp = temp.next;
                count++;
            }
            Node b2 = temp.next;
            Node b3 = temp.next.next;

            if(i != 0 && j != size() - 1) {
                a1.next = b2;
                b2.prev = a1;
    
                b2.next = a3;
                a3.prev = b2;
    
                a3.next = a2;
                a2.prev = a3;
    
                a2.next = b3;
                b3.prev = a2;
            }else if(i == 0 && j != size()) {

            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        Node temp = head;
        int size = 0;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        Node temp = head;
        String ans = "";
        while(temp != null) {
            ans += temp.data + " ";
            temp = temp.next;
        }
        return ans;
    }
}
