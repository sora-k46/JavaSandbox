public class StackLab {
    public static void main(String[] args) {
        MyStack st = new MyStack(4);
        st.push(5);
        System.out.println(st.topElement());
        st.push(20);
        st.push(99);
        System.out.println(st.isEmpty() +  " " + st.topElement());
        System.out.println(st.pop());
        System.out.println(st.topElement());

        System.out.println("Test BigNumber");
        BigNumber a = new BigNumber("998");
        BigNumber b = new BigNumber("2");

        System.out.println(a.add(b));

    }
}