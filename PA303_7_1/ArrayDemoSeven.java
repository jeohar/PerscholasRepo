package PA303_7_1;

public class ArrayDemoSeven {
    public static void main(String[] args) {
        /*
        Task 7: Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element, except for the middle (index 2) element
         */
       int[] intArray = new int[5];

       int midIndex = (intArray.length-1)/2;


       for(int i = 0; i< intArray.length; i++){
           if(i!=midIndex){
               System.out.println("Index " + i );
           }

       }







    }
}
