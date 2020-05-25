package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Ex3 {
    public static void main(String[] args) {
        String str = "Ana are mere si pere";
        findLongest(str);
    }


    public static void findLongest(String phrase){
        String[] chrs = phrase.split(" ");
        int maxLength = findLongestPhrase(chrs);
         Arrays.stream(chrs)
                .filter(c -> c.length() == maxLength)
                .forEach(System.out::println);
    }


    public static int findLongestPhrase(String[] chrs){
        return Arrays.stream(chrs)
                .map(String::length)
                .max(Integer::compare)
                .get();
    }

}
