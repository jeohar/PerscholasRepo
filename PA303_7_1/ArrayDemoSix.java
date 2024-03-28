package PA303_7_1;

public class ArrayDemoSix {
    public static void main(String[] args) {
        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied by 2 to
        the corresponding index in the array.
         */
       int[] intArray = {10, 55,6,55,500};

       //looping through intArray

        for(int i = 0; i<intArray.length;i++)
        {
            System.out.println("Index " + i + " Orginal Value " + intArray[i] + " x2 ->  " + intArray[i] * 2);
        }




    }
}
