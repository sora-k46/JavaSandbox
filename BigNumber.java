public class BigNumber {
    public String number;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    BigNumber(String number) {
        this.number = number;
    }

    BigNumber(int number) {
        this.number = Integer.toString(number);
    }

    public BigNumber add(BigNumber bn) {
        String answer = new String();
        MyStack st1 = new MyStack(number.length());
        MyStack st2 = new MyStack(bn.getNumber().length());

        int max = number.length() > bn.getNumber().length() ? number.length() : bn.getNumber().length();

        for(int i = 0; i < number.length(); i++) {
            st1.push(Character.getNumericValue(number.charAt(i)));
        }

        for(int i = 0; i < bn.getNumber().length(); i++) {
            st2.push(Character.getNumericValue(bn.getNumber().charAt(i)));
        }

        MyStack result = new MyStack(max + 1, true);
        int sum = 0;
        int carry = 0;
        for(int i = max - 1; i >= 0; i--) {
            sum = st1.pop() + st2.pop() + carry;
            carry = sum / 10;
            result.push(sum % 10);
            System.out.println(carry);
        }

        if(carry > 0) {
            result.push(1);
        }
        
        answer = result.toString();

        return new BigNumber(answer);
    }

    @Override
    public String toString() {
        return number;
    }
}