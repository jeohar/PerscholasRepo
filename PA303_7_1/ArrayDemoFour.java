package PA303_7_1;

import java.util.Arrays;

public class ArrayDemoFour {
    public static void main(String[] args) {
        /*
        Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
        Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
        Now try to assign a value to the array index 5. You should get the same type of exception.
         */
       int[] intArray = {10, 55,6,55,500};
       //print the first index
       System.out.println("First Index " + intArray[0]);

       //print the last index
       System.out.println("Last Index " + intArray[intArray.length-1]);




    }
}
