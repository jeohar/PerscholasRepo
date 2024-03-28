package ExtraActivities;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {25,26,27,29,36,8,300};
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > maxValue){
               maxValue= arr[i];
        }

    }
        System.out.println(maxValue);

        for(int j = arr.length-1; j>=0; j--){
            System.out.print(arr[j] + " ");
        }
}}
