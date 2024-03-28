package PA303_7_1;

public class ArrayDemoEigth {
    public static void main(String[] args) {
        /*
        Task 8: Write a program that creates a String array of 5 elements
         and swaps the first element with the middle element without creating a new array.
         */
        String[] array = {"A", "B", "C", "D", "E"};

        int midIndex = (array.length - 1) / 2;
        System.out.println("Orginal Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " : " + array[i]);

        }

        //to  substitute index of zero with middle index and vice versa, we use the swapping technique.

        String temp = array[0];
        array[0] = array[midIndex];
        array[midIndex] = temp;

        //Array after swapping
        System.out.println("\nArray after swapping first element with middle element: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " : " + array[i]);

        }



    }
}

