package glab303_2_3;

public class OperatorPractice {
    public static void main(String[] args) {

        /*
        Write a program that declares an integer a variable x, assigns the value 2 to it, and
    prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now,
    use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing
    the results, write a comment with the predicted decimal value and binary string. Now,
    print out x in decimal form and in binary notation.
    Perform the preceding exercise with the following values:
        a. 9
        b. 17
        c. 88
         */
        int x = 9;
        int x2 = 17;
        int x3 = 88;
        System.out.println(Integer.toBinaryString(x));
        x <<= 1;
        x2 <<= 1;
        x3 <<= 1;

        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);




    }
}
