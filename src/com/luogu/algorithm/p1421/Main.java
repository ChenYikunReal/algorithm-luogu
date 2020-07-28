package com.luogu.algorithm.p1421;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt();
        if (a<=10000 && b<=9 && a>=0 && b>=0) {
            int c = (int) (a*10 + b)/19;
            System.out.println(c);
        }
    }
}
