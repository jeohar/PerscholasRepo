package glab303_2_3;

public class OperatorPractice3 {
    public static void main(String[] args) {

        /*
        Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
Write a comment that indicates what you predict will be the result of the bitwise and
operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and
binary values, and assign the result to z.
         */
        int x =7;
        int y = 17;
        int z = x & y;
        System.out.println("Decimal value of z: " +z);
        System.out.println("Binary value of z: " + Integer.toBinaryString(z));


    }
}
