package glab303_11_2;
import java.util.List;
import java.util.ArrayList;
public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println("Initial List: " + programmingLanguages);
    //Remove the element at index 5
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);
        //Remove the first occurance of the given element from the arraylist
        //the remove() method returns false if the element does not exist in the arraylist
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\") : " + programmingLanguages);
        //remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        //remove all elements from the arraylist

        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}
