package glab303_2_3;

public class OperatorPractice4 {
    public static void main(String[] args) {

        /*
        Now, with the preceding values, use the bitwise and operator to calculate the “or”
value between x and y. As before, write a comment that indicates what you predict
the values to be before printing them out.
         */
        int x =7;
        int y = 17;
        int z = x | y;
        System.out.println("Decimal value of z: " +z);
        System.out.println("Binary value of z: " + Integer.toBinaryString(z));


    }
}
