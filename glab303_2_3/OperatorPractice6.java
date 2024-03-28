package glab303_2_3;

public class OperatorPractice6 {
    public static void main(String[] args) {

        /*
         Write a program that demonstrates at least three ways to increment a variable by 1
and does this multiple times. Assign a value to an integer variable, print it, increment
by 1, print it again, increment by 1, and then print it again.
         */
        int number = 5;

        // Method 1: Using the increment operator (++)
        System.out.println("Original value: " + number);
        number++; // Increment by 1
        System.out.println("Value after increment (Method 1): " + number);

        // Method 2: Using the addition operator (+)
        System.out.println("Original value: " + number);
        number = number + 1; // Increment by 1
        System.out.println("Value after increment (Method 2): " + number);

        // Method 3: Using compound assignment operator (+=)
        System.out.println("Original value: " + number);
        number += 1; // Increment by 1
        System.out.println("Value after increment (Method 3): " + number);



    }
}
