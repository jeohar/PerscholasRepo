package glab303_4_1;

public class ControlFlowPractice3 {
    /*
      Write a program that declares 1 integer variable x, and then
assigns 15 to it. Write an if-else-if statement that prints out “Less than
10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but
less than 20, and “Greater than or equal to 20” if x is greater than or
equal to 20. Change x to 50 and notice the result.

     */

    public static void main(String[] args) {

        int x = 15; // Declare and assign 15 to the integer variable 'x'

        // If-else-if statement to check the value of 'x' and print the corresponding message
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        // Change the value of 'x' to 50
        x = 50;

        // Re-evaluate the if-else-if statement with the new value of 'x'
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }
}
