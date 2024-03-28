package PA303_7_1;
import java.util.Scanner;
public class ArrayDemoEleven {
    public static void main(String[] args) {
        /*
        Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size.
         Then ask the user to enter the things and store them in the array you created.
         Finally, print out the contents of the array.
         */

       System.out.println("How many favorite things do you have?");
       Scanner input = new Scanner(System.in);
       int numberOfFavorites = input.nextInt();

       String[] favorites = new String[numberOfFavorites];

       Scanner userInput = new Scanner(System.in);
       System.out.println("Enter your favorite things: ");
       for(int i =0; i<numberOfFavorites;i++){
           favorites[i] = userInput.nextLine();
       }

       System.out.println("Your favorit things are: ");
       for(String favorite : favorites){
           System.out.println(favorite);
       }

    }
}
