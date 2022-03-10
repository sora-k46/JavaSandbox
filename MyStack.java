public class MyStack {
    private int[] info;
    private int top;
    private int capacity;
    private boolean isRepresentNumber;
    private int size;

    MyStack() {
        info = new int[101];
        top = 0;
        isRepresentNumber = false;
    }

    MyStack(boolean isRepresentNumber) {
        info = new int[101];
        top = 0;
        this.isRepresentNumber = isRepresentNumber;
    }

    MyStack(int capacity) {
        this.capacity = capacity;
        info = new int[capacity];
        top = 0;
        isRepresentNumber = false;
    }

    MyStack(int capacity, boolean isRepresentNumber) {
        this.capacity = capacity;
        info = new int[capacity];
        top = 0;
        this.isRepresentNumber = isRepresentNumber;
    }

    public int pop() {
        int result = 0;
        if(!isEmpty()) {
            result = info[top - 1];
            top--;
            size--;
        }
        return result;
    }

    public void push(int data) {
        if(!isFull()) {
            info[top] = data;
            top++;
            size++;
        }
    }

    public int topElement(){
        if(!isEmpty()) {
            return info[top - 1];
        }
        return 0;
    }

    public void clear(){
        top = 0;
    }

    public boolean isEmpty(){
        return top == 0 ? true : false;
    }

    public boolean isFull() {
        return top >= info.length ? true : false;
    }

    public int size() {
        return isEmpty() ? 0 : size;
    }

    public int capacity() {
        return capacity;
    }

    @Override
    public String toString() {
        String result = new String();
        if(isRepresentNumber) {
            for(int i = info.length - 1; i >= 0; i--) {
                result += Integer.toString(info[i]);
            }
        }else {
            for(int i = info.length - 1; i >= 0; i--) {
                result += Integer.toString(info[i]) + " ";
            }
        }
        return result;
    }
}