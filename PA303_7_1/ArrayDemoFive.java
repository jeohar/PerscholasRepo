package PA303_7_1;

public class ArrayDemoFive {
    public static void main(String[] args) {
        /*
        Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
         */
       int[] intArray = {10, 55,6,55,500};
       System.out.println("Array Length: " + intArray.length);

       for(int i = 0; i< intArray.length; i++)
           System.out.println("Index " + i + " = " + intArray[i]);






    }
}
