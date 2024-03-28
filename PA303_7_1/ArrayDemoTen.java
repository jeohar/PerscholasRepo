package PA303_7_1;

import java.util.ArrayList;

public class ArrayDemoTen {
    public static void main(String[] args) {
        /*
        Task 10: Create an array that includes an integer,
        3 strings, and 1 double. Print the array.
         */

        //to proceed with Task 10, I need to use Array of Object

        Object[] mixedArray = {25, "Adieb", "Abdul", "Rahman", 99.99, 'B', true};
        for(int i =0;i<mixedArray.length; i++)
            System.out.println("Index " + i + ": " + mixedArray[i]);
    }
}
