package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input factorial >1: ");
        int f = sc.nextInt();
        long a = 0;
        int i = 1;
        while (i<=f){
            a= a + getF(i);
            i++;
        }
        long fact = getF(f);
        double sum = 1.0/getF(f) * a;
        System.out.println("Sum is: "+sum);

}

    public static long getF(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getF(f - 1);
        }
    }
}
