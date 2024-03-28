package ExtraActivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubStringPractice {
    public static void main(String[] args) {

        String str = "Welcometojava";
        List<String> subStrings = new ArrayList<>();
        for(int i = 0; i <=str.length() - 3; i++){
            subStrings.add(str.substring(i, i + 3));
        }
        System.out.println(subStrings);

        Collections.sort(subStrings, Comparator.reverseOrder());
        System.out.println(subStrings);

    }
}
