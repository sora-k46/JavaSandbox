
public class MQueue {

    private int[] list;
    private int front;
    private int back;
    private int size;

    MQueue () {
        size = 10;
        list = new int[size];
        front = -1;
        back = 0;
    }

    MQueue (int size) {
        this.size = size;
        list = new int[size];
        front = -1;
        back = 0;
    }

    public int dequeue () {
        if (!isEmpty()) {
            if (front == size) {
                if (!isFull()) {
                    front = 0;
                }
            } else {
                int temp = list[front];
                list[front] = 0;
                front++;
                return temp;
            }
        }
        return -999;
    }

    public void enqueue (int data) {
        if (!isFull()) {
            if (!isEmpty()) {
                if (back == size) {
                    back = 0;
                    list[back++] = data;
                } else {
                    list[back++] = data;
                }
            } else {
                list[back++] = data;
                front++;
            }
        }
    }

    public int getFront () {
        return front;
    }

    public int getBack () {
        return back;
    }

    public int peek () {
        return list[front];
    }

    public void printQueue () {
        for (int i = 0; i < list.length; ++i) {
            System.out.println(list[i]);
        }
        System.out.println("Front: " + front);
        System.out.println("Back: " + back);
    }

    public void clear () {
        front = -1;
        back = 0;
    }

    public boolean isEmpty () {
        return front == -1;
    }

    public boolean isFull () {
        return front == 0 && back == size || front == back;
    }
}
