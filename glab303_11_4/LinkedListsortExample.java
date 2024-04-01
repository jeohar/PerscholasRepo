package glab303_11_4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {
    public static void main(String[] args) {
        //create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        //unsorted
        System.out.println(linkedList);
        //Sort the list
        Collections.sort(linkedList);

        //sorted
        System.out.println(linkedList);

        //custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        //Custom sorted

        System.out.println(linkedList);
    }
}
