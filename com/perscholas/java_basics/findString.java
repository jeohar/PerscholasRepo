package com.perscholas.java_basics;

public class findString {
    public static void main(String[] args) {
        String str1 = "Java is fun";
        int result;

        result = str1.indexOf('S');
        System.out.println(result);
        result = str1.lastIndexOf('J');

        result = str1.lastIndexOf('a');
        System.out.println(result);

    }
}
