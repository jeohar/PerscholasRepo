package PA303_7_1;

import java.util.Arrays;

public class ArrayDemoThree {
    public static void main(String[] args) {
        /*
        Write a program that creates an array of String type and initializes
         it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
         Make a copy using the clone( ) method. Use the Arrays.
        toString( ) method on the new array to verify that the original array was copied.
         */
        String[] OriginalArray = {"red", "green", "blue", "yello"};

            System.out.println("Array length: " + OriginalArray.length);

//        System.out.print("Orginal Array  " +"\n");
//        for(int i = 0; i<OriginalArray.length; i++)
//            System.out.println(OriginalArray[i] + " ");


       // System.out.println("Orginal Array: " + OriginalArray );

        System.out.println("Orinal Array: " + Arrays.toString(OriginalArray));

        String[] cloneArray = OriginalArray.clone();
        //Arrays.toString(cloneArray);

        System.out.println("Cloned Array: " + Arrays.toString(cloneArray));





        


    }
}
