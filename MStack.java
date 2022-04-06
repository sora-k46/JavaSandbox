
public class MStack {

    private String number;
    private int[] list;
    private int top;
    private int capacity;

    MStack () {
        capacity = 1000;
        list = new int[capacity];
        top = 0;
    }

    MStack (int capacity) {
        this.capacity = capacity;
        list = new int[capacity];
        top = 0;
    }

    public int getTop () {
        return top;
    }

    public boolean isEmpty () {
        return top <= 0;
    }

    public void push (int data) {
        if (top < capacity) {
            list[top++] = data;
        }
    }

    public int pop () {
        if (!isEmpty()) {
            return list[--top];
        }
        return 0;
    }

    public int peek () {
        return list[top - 1];
    }

    public void clear() {
        list = new int[capacity];
        top = 0;
    }

    public int getCapacity () {
        return capacity;
    }
}
