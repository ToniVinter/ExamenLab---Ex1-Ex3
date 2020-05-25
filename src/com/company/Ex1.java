package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,99,88,22,12,4,3,6);
        System.out.println(ObtainPrimeNumbers(list));
    }

    public static List<Integer> ObtainPrimeNumbers(List<Integer> numbers){
        List<Integer> listOfPrimeNumbers = new ArrayList<>();
        for (Integer number : numbers){
            if(IsPrim(number)){
                listOfPrimeNumbers.add(number);
            }
        }
        Collections.sort(listOfPrimeNumbers, Collections.reverseOrder());
        return listOfPrimeNumbers;
    }

    private static boolean IsPrim(Integer number) {
        for (int i = 2; i<= Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
