package glab303_11_5;
import java.sql.SQLOutput;
import java.util.HashSet;

public class exampletwo {
    public static void main(String[] args) {


        HashSet<Integer> evenNumber = new HashSet<Integer>();
        evenNumber.add(2);
        evenNumber.add(4);

        System.out.println("HashSet1: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);

        System.out.println("HashSet2: " + numbers);
        numbers.addAll(evenNumber);
        System.out.println("Union is: " + numbers);






    }
}
