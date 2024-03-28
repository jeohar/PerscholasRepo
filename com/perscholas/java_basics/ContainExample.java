package com.perscholas.java_basics;

public class ContainExample {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        Boolean result;

        //Chek if str1 contains Java

        result = str1.contains("Java");
        System.out.println(result);

        //Check if str1 contains python

        result = str1.contains("Python");
        System.out.println(result);

        //check if str1 contains " "
        result = str1.contains("");
        System.out.println(result);


    }
}
