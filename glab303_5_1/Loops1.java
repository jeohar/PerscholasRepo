package glab303_5_1;

public class Loops1 {
    public static void main(String[] args) {
        // Program to find the sum of natural numbers from 1 to 1000.

        int sum = 0;
        int n = 1000;

        for(int i = 1; i <=n; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
