
public class Test {
    public static void main(String[] args) {
        int[] data = {40, 55, 12, 500, 300, 29, 46, 88, 79, 92, 30, 56, 1000, 49};
        print(data);
        // selectionSort(data);
        // insertionSort(data);
        // bubbleSort(data);
        bubbleSortZ(data);
        print(data);
    }
    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int insertingItem = arr[i];
            int  j;
            for (j = i - 1; j >= 0 && arr[j] > insertingItem; --j) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = insertingItem;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // version CSC209
    public static void bubbleSortZ(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = arr.length - 1; j > 0; --j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void TestDLL() {
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