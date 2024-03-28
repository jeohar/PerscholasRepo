package ExtraActivities;
import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt(); // the number of element that we want to input

        System.out.println("Now please enter " + n + " number: -> ");
        int[] userInput = new int[n];

        for(int i = 0; i <n; i++){
            userInput[i] = sc.nextInt();
        }

        // we need another for loop to display the result
//        System.out.print("You entered: ");
//        for(int userArray : userInput){
//            System.out.print(userArray);
//
//        }
        System.out.print("You entered: ");
        for (int i = 0; i < n; i++) {
            System.out.print(userInput[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }


    }
}}
