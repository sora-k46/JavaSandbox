public class SLL {
    public Node head;
    public Node tail;

    public SLL() {
        head = null;
        tail = null;
    }

    public SLL(Node head) {
        this.head = head;
    }

    public SLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
        head.next = tail;
    }

    public void addToHead(Node node) {
        if(head == null) {
            head = node;
            tail = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    
    public void removeFromHead() {
        if(head != null) {
            head = head.next;
        }
    }

    public void addToTail(Node node) {
        if(head == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    public void removeFromTail() {
        if(head != null) {
            Node temp = head;
            while(temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void addAt(int i, Node node) {
        if(head != null && size() > i && i > 0) {
            Node temp = head;
            int count = 0;
            while(count != i - 1) {
                temp = temp.next;
                count++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void removeAt(int i) {
        if(head != null && size() > i && i > 0) {
            Node temp = head;
            int count = 0;
            while(count != i - 1) {
                temp = temp.next;
                count++;
            }
            Node temp2 = temp.next;
            temp.next = temp2.next;
            temp2.next = null;
        }
    }

    public void swapNode(int i, int j) {
        // TODO: Don't forget the special cases
        if(i > j || i < 0 || j > size() || j < 0 || isEmpty()) return;
        if(size() == 2) {
            tail.next = head;
            head.next = null;
            head = tail;
            return;
        }
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if(count == i - 1 || i == 0) break;
            temp = temp.next;
            count++;
        }
        Node a1 = temp; //before ith node
        Node a2 = temp.next;// the ith node
        Node a3 = temp.next.next;// after ith node
        temp = head;
        count = 0;
        while(temp != null) {
            if(count == j - 1 || j == 0) break;
            temp = temp.next;
            count++;
        }
        Node b2 = temp.next;// the ith node
        Node b3 = temp.next.next;// after ith node
        a2.next = b3;
        a1.next = b2;
        b2.next = a3;
        a3.next = a2;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    @Override
    public String toString() {
        if(head == null) return "empty";
        String ans = "";
        Node temp = head;
        while(temp != null) {
            ans += temp.data + " ";
            temp = temp.next;
        }
        return ans;
    }

}
