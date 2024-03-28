package glab303_3_2;

import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        System.out.println("S1 is " +s1);
        System.out.println("S2 is " +s2);
        System.out.println("S3 is " +s3);


    }
}
