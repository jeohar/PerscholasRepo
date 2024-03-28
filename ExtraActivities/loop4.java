package ExtraActivities;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        /*
        •	•	Print even numbers from 1 to 20 using a while loop.
        •
         */

        Scanner start = new Scanner(System.in);
        Scanner end = new Scanner(System.in);

        System.out.println("Enter start range ");
        int x = end.nextInt();
        System.out.println("Enter end range ");
        int y = end.nextInt();

        isEven(x, y);


    }

    public static void isEven(int start, int end) {
        int i = start;

        while (i <= end) {
            if (i % 2 == 0) {
                System.out.println(i + " even");
            }else {
                System.out.println(i  + " odd");
            }
            i++;


        }
    }
}
