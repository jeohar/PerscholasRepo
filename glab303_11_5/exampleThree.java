package glab303_11_5;

import java.util.HashSet;

public class exampleThree {

    public static void main(String[] args) {

        //To calculate the difference between two set, we can use the removeAll() metod

        HashSet<Integer> primeNumbers = new HashSet<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);

        System.out.println("HashSet1: " + primeNumbers);
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        //Diff between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference: " + primeNumbers);



    }
}
