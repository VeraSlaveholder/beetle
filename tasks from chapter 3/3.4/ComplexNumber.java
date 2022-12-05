package Task33;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());

    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ComplexNumber complexNumber = (ComplexNumber) o;
        return re == complexNumber.getRe() &&
                im == complexNumber.getIm();
    }

    @Override
    public int hashCode() {
        //return Objects.hash(re, im);
        long reBits = Double.doubleToLongBits(re);
        long miBits = Double.doubleToLongBits(im);
        miBits += miBits << 5;  // miBits * 33  http://www.cse.yorku.ca/~oz/hash.html
        return (int)(reBits ^ (reBits >>> 32) ^ miBits ^ (miBits >>> 32));
    }
}
