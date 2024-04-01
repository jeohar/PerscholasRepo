package ExtraActivities;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Ahamd");
        obj.add("Wais");
        obj.add("Qais");
        obj.add("Karim");
        obj.add("Wafa");
        obj.add("Zarina");
        obj.add("Freshta");
        obj.add("Maseeha");

        for(String s: obj){
            System.out.print(s + "\t");
        }

    }
}
