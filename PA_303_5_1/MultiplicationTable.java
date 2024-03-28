package PA_303_5_1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table size: ");
        int tableSize = sc.nextInt();

        String line = "Multiplication Table";

        // Calculate the number of spaces needed to print the line in the middle
        int totalWidth = 80; // Assuming the console width is 80 characters
        int lineLength = line.length();
        int spacesOnEachSide = (totalWidth - lineLength) / 2;

        // Print the spaces on the left side
        for (int i = 0; i < spacesOnEachSide; i++) {
            System.out.print(" ");
        }

        // Print the line
        System.out.println(line);

        System.out.println("\n---------------------------------------------------------------------------------------");

        for(int i = 1; i<=tableSize; i++){
            for(int j=1; j<=tableSize; j++){
                System.out.print("\t\t|" + i * j);
            }

            System.out.println();
        }
    }

}
