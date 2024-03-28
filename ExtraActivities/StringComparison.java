package ExtraActivities;
import java.util.*;

public class StringComparison {
    ;


        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter sequences of strings: ");
//            String str = input.next();
//            List<String> substrings = generateSubstrings(str);
//            Collections.sort(substrings); // Sort the substrings lexicographically
//            System.out.println(substrings);
//        }
//
//        public static List<String> generateSubstrings(String str) {
//            List<String> substrings = new ArrayList<>();
//            for (int i = 0; i <= str.length() - 3; i++) {
//                substrings.add(str.substring(i, i + 3));
//            }
//            return substrings;

            String str = "welcometojava";
            List<String>subStrings = new ArrayList<>();

            for(int i = 0; i<= str.length() - 3; i++){
                subStrings.add(str.substring(i, i + 3));

            }
          //  System.out.println(subStrings);
            Collections.sort(subStrings, Comparator.reverseOrder());
            System.out.println(subStrings);







        }
    }
    /*
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] input = new int[n];

        System.out.println("Enter " + n + " whole numbers: ");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println("Entered numbers:");
        for (int arrayInput : input) {
            System.out.println(arrayInput);
         */



