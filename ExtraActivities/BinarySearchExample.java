package ExtraActivities;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] arr= { 22,55,88,99,66,33,77,55,11,45,69};

        int x = 70;
        Arrays.sort(arr);

        System.out.println(x + " found at the  index number : " + Arrays.binarySearch(arr, x));
        int index = Arrays.binarySearch(arr, x);

        if (index >= 0) {
            System.out.println(x + " found at index number: " + index);
        } else {
            System.out.println(x + " not found in the array.");
        }
    }
}
