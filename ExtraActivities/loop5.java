package ExtraActivities;

import java.math.BigInteger;
import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        /*
        •
        •	Write a program to find the factorial of a number using a do-while loop.
         */

        Scanner input = new Scanner(System.in);
       // Scanner end = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int result = input.nextInt();
        System.out.println("Factorial of " + result + " is " + factorial(result));




    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for(int i = 1; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
