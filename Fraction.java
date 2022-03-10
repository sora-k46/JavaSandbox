public class Fraction {
    // HOMEWORK: Fraction, Name: Sorrawit Kwanja, ID: 64130500271
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if(denominator == 0) {
            System.out.println("Can't divide by 0");
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        negativeToPositive();
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        negativeToPositive();
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0) {
            System.out.println("Can't divide by 0");
            throw new ArithmeticException();
        }
        this.denominator = denominator;
        negativeToPositive();
    }

    public Fraction add(Fraction fraction) {
        if(fraction.getDenominator() == denominator) {
            return new Fraction(fraction.getNumerator() + numerator, denominator);
        }
        int x = fraction.getDenominator() * numerator;
        int y = denominator * fraction.getNumerator();
        int z = denominator * fraction.getDenominator();
        return new Fraction(x + y, z);
    }

    public Fraction subtract(Fraction fraction) {
        if(fraction.getDenominator() == denominator) {
            return new Fraction(numerator - fraction.getNumerator(), denominator);
        }
        int x = fraction.getDenominator() * numerator;
        int y = denominator * fraction.getNumerator();
        int z = denominator * fraction.getDenominator();
        return new Fraction(x - y, z);
    }

    public Fraction multiply(Fraction fraction) {
        int x = numerator * fraction.getNumerator();
        int y = denominator * fraction.getDenominator();
        return new Fraction(x, y);
    }

    public Fraction divide(Fraction fraction) {
        int x = numerator * fraction.getDenominator();
        int y = denominator * fraction.getNumerator();
        return new Fraction(x, y);
    }

    public void reduce() {
        if(numerator == 0) return;
        int GCD = GCD(numerator, denominator);
        numerator /= GCD;
        denominator /= GCD;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Recursive Euclid's Algorithm for finding GCD
    /* 
        If a = 0, then GCD (a, b) = b as GCD (0, b) = b.
        If b = 0, then GCD (a, b) = a as GCD (a, 0) = a.
        If both a≠0 and b≠0, we write 'a' in quotient remainder form (a = b×q + r) where q is the quotient and r is the remainder, and a>b.
        Find the GCD (b, r) as GCD (b, r) = GCD (a, b)
        We repeat this process until we get the remainder as 0.
    */
    private int GCD(int x, int y) {
        if(y == 0) return x;
        return GCD(y, x % y);
    }

    private void negativeToPositive() {
        if(numerator < 0 && denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }
    
}
