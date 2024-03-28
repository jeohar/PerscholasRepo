package ExtraActivities;

public class ArrayAverage {
    public static void main(String[] args) {

        int [] num = {22,55,3,6,99,88,74,2,1,6,8,4,25,66,9,99};
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<num.length; i++){
            sum+=num[i];
            avg = sum/num.length;

        }
        System.out.println("Array Length: " + num.length);
        System.out.println("Sum = " + sum);

        System.out.println("Average = " + avg);
    }
}
