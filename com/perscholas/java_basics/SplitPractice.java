package com.perscholas.java_basics;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String vowels = "a::b::c::d::E";
        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));
    }
}
