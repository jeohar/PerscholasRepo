package glab303_4_1;

public class ControlFlowPractice2 {
    /*
     Write a program that declares 1 integer variable x, and then
assigns 7 to it. Write an if-else statement that prints out “Less than 10”
if x is less than 10, and “Greater than 10” if x is greater than 10.
Change x to 15 and notice the result.

     */

    public static void main(String[] args) {

      //  Scanner input = new Scanner(System.in);
        int x = 15;

        if ( x < 10){
            System.out.println("Less than 10");
        }else {
            System.out.println("greater than 10");
        }

    }
}
