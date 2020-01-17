/**
 * Floating point number - have fractional parts; aka real numbers
 *
 * Float - single precision (format and amount of space occupied by the type.
 *  - 32 bits
 *
 * Double - double precision
 *  - 64 bits
 *
 *  Double is much more precise than float
 */

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        System.out.println("int " + myIntValue);
        System.out.println("float " + myFloatValue);
        System.out.println("double " + myDoubleValue);


    }
}
