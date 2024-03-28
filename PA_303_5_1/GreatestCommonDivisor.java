package PA_303_5_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int userInput1 = input.nextInt();


        System.out.println("Enter another whole number: ");
        int userInput2 = input.nextInt();


       int gcd = findGCD(userInput1, userInput2);
       System.out.println("The GCD of " +userInput1 + " and " + userInput2 + " is " + gcd);;




    }
    public static int findGCD (int a, int b) {
         while(b!=0){
             int temp = b;
             b = a % b;
             a = temp;
         }
        return a;
    }

}
