package glab303_6_1;

public class MeanSDArray {
    public static void main(String[] args) {
        int[] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int sumSq = 0;
        double mean;
        double stdDev;
        //Compute the sum and square sum using for loop
        for(int i = 0; i< marks.length; ++i){
            sum += marks[i];
            sumSq = marks[i] * marks[i];

        }
        mean = (double) sum/marks.length;
        stdDev = Math.sqrt((double) sumSq /marks.length - mean * mean);

        System.out.println(mean);
        System.out.println(stdDev);

    }
}
