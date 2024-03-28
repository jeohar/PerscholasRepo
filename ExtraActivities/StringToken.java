package ExtraActivities;

import java.util.Arrays;

public class StringToken {
    public static void main(String[] args) {
        String str = "10 He is a very very good boy, isn't he?";
        String[] afterSplit = str.split("\\s+|(?=[!,?._'@])|(?<=[!,?._'@])");
        //String[] afterSplit = str.split("[A-Za-z !,?._'@]");



        //print each element from afterSplit

        for(String word : afterSplit){
            if (!word.isEmpty() && !word.matches("[!,?._'@]+")) {
                System.out.println(word);
            }
        }

    }

}
