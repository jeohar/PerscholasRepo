package glab303_11_5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExampleone {
    public static void main(String[] args) {
        TreeSet<Integer> num_TreeSet = new TreeSet<>();
        num_TreeSet.add(20);
        num_TreeSet.add(5);
        num_TreeSet.add(15);
        num_TreeSet.add(25);
        num_TreeSet.add(10);

        //Call iterator method() to define itrator for TreeSet
        Iterator<Integer> iter_set = num_TreeSet.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Access TreeSet elements using Iterator
        while(iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(", ");
        }
    }

}
