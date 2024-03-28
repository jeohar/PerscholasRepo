package com.perscholas.java_basics;

public class replaceAll {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

        // "\\d+" is a regular expression that matchs one or more digits
        String regex = "\\d+";
        //replace all occurance of numberic
        // digits by a space

        System.out.println(str1.replaceAll(regex, " "));

    }
}
