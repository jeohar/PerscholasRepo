package com.perscholas.java_basics;

public class IsEmptyExample {
    public static void main(String args[]){
        String str1 =" ";
        String str2 = "hello";
        System.out.println(str1.isEmpty() || str1.isBlank());
        System.out.println(str2.isEmpty());
    }
}
