import javax.swing.event.ListSelectionEvent;

public class Test {
    public static void main(String[] args) {
        DLL list = new  DLL();
        list.addToHead(new Node(20));
        list.addToHead(new Node(30));
        list.addToHead(new Node(40));
        list.addToHead(new Node(90));
        list.removeAtHead();
        list.addToTail(new Node(222));
        list.removeFromTail();
        list.removeFromTail();
        list.addAt(1, new Node(2398));
        list.removeAt(1);
        System.out.println(list);
        list.swapNode(0, 1);
        System.out.println(list);
        list.addToTail(new Node(2390));
        list.addToTail(new Node(235));
        list.addToTail(new Node(5698));
        list.addToTail(new Node(34890));
        System.out.println(list);
        list.swapNode(0, 3);
        System.out.println(list);
    }

    public static void TestSLL() {
        SLL list = new SLL(new Node(5), new Node(20));
        System.out.println(list);
        list.addToHead(new Node(200));
        System.out.println(list);
        list.removeFromHead();
        list.removeFromHead();
        System.out.println(list);
        list.addToHead(new Node(50));
        list.addToHead(new Node(256));
        list.addToHead(new Node(999));
        System.out.println(list);
        list.addToTail(new Node(800));
        System.out.println(list);
        list.removeFromTail();
        System.out.println(list.size());
        System.out.println(list);
        list.addAt(1, new Node(1000000));
        System.out.println(list);
        list.removeAt(1);
        System.out.println(list);
        list.swapNode(1, 2);
        System.out.println(list);
        list = new SLL(new Node(50), new Node(200));
        System.out.println(list);
        System.out.println(list.size());
        list.swapNode(0, 1);
        System.out.println(list);
    }
}