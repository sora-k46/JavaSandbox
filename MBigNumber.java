public class MBigNumber {

    public static MStack add (MStack numA, MStack numB) {
        int capacity = 0;
        if (numA.getCapacity() < numB.getCapacity()) {
            capacity = numB.getCapacity();
        } else {
            capacity = numA.getCapacity();
        }
        MStack result = new MStack(capacity);
        int carry = 0;
        for (int i = 0; i < capacity; ++i) {
            if (carry == 0 && i == capacity - 1) {
                break;
            }
            int sum = numA.pop() + numB.pop() + carry;
            carry = sum / 10;
            result.push(sum % 10);
        }
        return result;
    }

    public static MStack parser (String number) {
        MStack result = new MStack(number.length() + 1);
        for (int i = 0; i < number.length(); ++i) {
            result.push(charToInt(number.charAt(i)));
        }
        return result;
    }

    public static String toString (MStack number) {
        String result = new String();
        for (int i = 0; i < number.getCapacity(); ++i) {
            result += number.pop();
        }
        return result;
    }

    private static int charToInt (char number) {
        int result = 0;
        switch (number) {
            case '0':
                result =  0;
                break;
            case '1':
                result = 1;
                break;
            case '2':
                result = 2;
                break;
            case '3':
                result = 3;
                break;
            case '4':
                result = 4;
                break;
            case '5':
                result = 5;
                break;
            case '6':
                result = 6;
                break;
            case '7':
                result = 7;
                break;
            case '8':
                result = 8;
                break;
            case '9':
                result = 9;
                break;
        }
        return result;
    }
}
