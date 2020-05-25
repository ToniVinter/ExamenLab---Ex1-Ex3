package com.company;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(cifraDeControl(499));
    }

    public static int cifraDeControl(int nr){
        int sum = 0;
        if(nr/10 == 0){
            return nr;
        }else{
            while (nr!= 0){
                sum += nr%10;
                nr = nr/10;
            }
            return cifraDeControl(sum);
        }
    }
}
