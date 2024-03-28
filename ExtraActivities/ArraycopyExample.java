package ExtraActivities;

import java.util.Arrays;

public class ArraycopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {2,5,6,9,12,-2};
        int[] targetArray = new int[sourceArray.length];
       // System.out.println(Arrays.toString(targetArray));

        System.out.println("Elements in the sourceArray --> " + Arrays.toString(sourceArray));
        System.out.println("Elements in the targetArray --> " + Arrays.toString(targetArray));

        System.arraycopy(sourceArray, 4, targetArray, 1, 2);

        //printing using toString
        System.out.println("Arrays after copy --> " + Arrays.toString(targetArray));
        //printing using forloop





        System.out.print("After copy from sourceArray ");
        for(int i =0; i<targetArray.length; i++)
        {

            System.out.print(targetArray[i] + ", ");


        }


    }
}
