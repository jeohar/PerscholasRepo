package ExtraActivities;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
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
        /*
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter three whole numbers: ");
        int n;
        n = sc.nextInt();
        int [] input = new int[n];

        for(int arrayInput: input){
            System.out.println(arrayInput);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        //n = sc.nextInt();
        int [] input = new int[n];
        System.out.println("Enter " + n + " whole numbers: ");

        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();

        }

        System.out.println("Entered numbers: ");
        for(int arrayInput : input){
            System.out.println(arrayInput);
        }


    }
}
