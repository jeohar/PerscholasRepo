package glab303_11_2;
import java.util.List;
import java.util.ArrayList;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //creating an arraylist from another collection
        List<Integer> obj = new ArrayList<>(firstFivePrimeNumbers);
        obj.add(13);
        obj.add(17);
        obj.add(19);
        obj.add(23);
        obj.add(29);

        //adding an entire collection to an arraylist
        firstFivePrimeNumbers.addAll(obj);
        System.out.println(firstFivePrimeNumbers);

    }
}
