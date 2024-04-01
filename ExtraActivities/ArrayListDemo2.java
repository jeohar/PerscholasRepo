package ExtraActivities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> obj = Arrays.asList("Ahmad", "Khan", "Zaki");
        List<Integer> obj2 = Arrays.asList(55,22,99,55,66,77,88,55,66,55,66);


//        for(String s: obj){
//            System.out.print(s + "\n\t");
//        }
//        for(int i: obj2){
//            System.out.print(i + "\t");
//        }

        Iterator itr = obj.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());

            }

    }
}
