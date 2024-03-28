package PA303_7_1;

public class ArrayDemoSixII {
    public static void main(String[] args) {
        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied by 2 to
        the corresponding index in the array.
         */
       int[] intArray = new int[5];

       for(int i = 0; i<intArray.length; i++)
           intArray[i]= (i+1) * 2;


       System.out.println("Updated Array: ");
       for(int i =0; i<intArray.length; i++)
           System.out.println("Index " + i + ": " + intArray[i]);


       //looping through intArray



    }
}
