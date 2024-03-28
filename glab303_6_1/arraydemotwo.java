package glab303_6_1;

public class arraydemotwo {
    public static void main(String[] args) {
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};

        int sum = 0;
        Double average;
        for(int num: numbers){
            sum = sum+num;
        }
        //get the total number of elements
        int arrayLength = numbers.length;
        //convert the average from int to double
        average = ((double) sum / (double) arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
