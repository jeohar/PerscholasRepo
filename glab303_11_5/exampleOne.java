package glab303_11_5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class exampleOne {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        //Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println("HashSet: " +evenNumber);

        HashSet<Integer> numbers = new HashSet();
        //Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);

        System.out.println("New HashSet: " + numbers);
  //Custom sorting
//        Collections.sort(numbers, Collections.reverseOrder());
       //Convert HashSet to ArrayList

        List<Integer> numList = new ArrayList<>(numbers);
        //Custom sorting
        Collections.sort(numList, Collections.reverseOrder());
        System.out.println("Custom sorted: " + numList);
        //Convert ArrayList back to HashSet
//        numbers= new HashSet<>(numList);
//        System.out.println("Custom HashSet sort: " + numbers);

    }
}
