package ExtraActivities;

public class CopyingAray {
    public static void main(String[] args) {
        int[] intArray = {12, 15, 17};

        //define an array copyArray to copy contents of intArray
        int []copyArray= new int[intArray.length];
        //copy contents of intArray to copyArray

            for(int i = 0; i<intArray.length; i++)
                copyArray[i] = intArray[i];

            //update element of copyArray
            copyArray[0]++;

            //print both arrays
        System.out.println("Element of intArray[]: ");
        for(int i = 0 ;i <intArray.length;i++)
            System.out.println(intArray[i] + " ");


        System.out.println("\n\nElement of copyArray[]: ");
        for(int i = 0; i<copyArray.length;i++)
        System.out.println(copyArray[i] + " ");





    }
}
