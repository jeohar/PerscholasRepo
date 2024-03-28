package ExtraActivities;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = sc.next();
    System.out.println(isPlandrom(input));

    }

    private static String isPlandrom(String str) {


    //compare original string with its reverse

        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) !=str.charAt(end)){
                return "Not Palindrom";
            }
            start++;
            end--;
        }

        return str;
    }

}
