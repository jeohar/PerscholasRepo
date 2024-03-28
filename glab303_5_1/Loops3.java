package glab303_5_1;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {

        /*
        In this example, we are going to see whether a number is a palindrome. A for loop is used in this case. A palindrome number, when reversed, represents the same number.
         */
       String original, reverse = "";
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a string/number to check if it a palindrome");
        original = in.nextLine();
        int length = original.length();
        for(int i = length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
            if(original.equals(reverse)){
                System.out.println("Entere String/number is palindrom");
            }else{
                System.out.println("Not palindrome");
            }


        }


    }

