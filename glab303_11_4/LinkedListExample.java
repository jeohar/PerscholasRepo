package glab303_11_4;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("item1");
        linkedList.add("item5");
        linkedList.add("item3");
        linkedList.add("item6");
        linkedList.add("item2");

        //display linked list content
        System.out.println("Linked List Content: "+ linkedList);

        //Add first and last element
        linkedList.addFirst("FirstItem");
        linkedList.addLast("LastItem");

        System.out.println("Linked List after addition: " + linkedList);

        //This is how to get and set values
        Object fistvar = linkedList.get(0);
        System.out.println("First element: "+ fistvar);
        linkedList.set(0, "Changed first item");
        Object firstvar2 = linkedList.get(0);
        System.out.println("First element after update by set method: " + firstvar2);

        //remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked List after deletion of first and last element: "+ linkedList);

        // add to a position and remove from a position

        linkedList.add(0,"Newsly added item");
        linkedList.remove(2);
        System.out.println("Final Content: " +linkedList);

    }
}
