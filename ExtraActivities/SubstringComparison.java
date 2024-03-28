package ExtraActivities;

import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Input the length of the substring to compare
        System.out.print("Enter the length of the substring to compare: ");
        int length = scanner.nextInt();

        // Compare substrings of the two strings
        compareSubstrings(str1, str2, length);
    }

    public static void compareSubstrings(String str1, String str2, int length) {
        // Check if the strings are long enough for comparison
        if (str1.length() < length || str2.length() < length) {
            System.out.println("Strings are not long enough for comparison.");
            return;
        }

        // Extract substrings from both strings
        String subStr1 = str1.substring(0, length);
        String subStr2 = str2.substring(0, length);

        // Compare the substrings lexicographically
        int result = subStr1.compareTo(subStr2);

        // Print the result of the comparison
        if (result < 0) {
            System.out.println("The substring of \"" + str1 + "\" is lexicographically smaller than the substring of \"" + str2 + "\".");
        } else if (result > 0) {
            System.out.println("The substring of \"" + str1 + "\" is lexicographically larger than the substring of \"" + str2 + "\".");
        } else {
            System.out.println("The substrings of \"" + str1 + "\" and \"" + str2 + "\" are lexicographically equal.");
        }
    }
}