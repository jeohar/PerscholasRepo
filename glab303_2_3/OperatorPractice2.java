package glab303_2_3;

public class OperatorPractice2 {
    public static void main(String[] args) {

        /*
        Write a program that declares a variable x, and assigns 150 to it, and prints out the
binary string version of the number. Now use the right shift operator (>>) to shift by 2
and assign the result to x. Write a comment indicating what you anticipate the
decimal and binary values to be. Now print the value of x and the binary string.
Perform the preceding exercise with the following values:
a. 225
1
b. 1555
c. 32456
         */
        int x = 150;
        int x2 = 1555;
        int x3 = 32456;
        System.out.println(Integer.toBinaryString(x));
        x >>= 2;
        x2 >>= 2;
        x3 >>= 2;

        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);




    }
}
