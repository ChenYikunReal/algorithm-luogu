package com.luogu.algorithm.p6850;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 50;
        for (int i = 0; i < 7; i++) {
            sum += sc.nextInt();
        }
        sum += sc.nextInt()*5;
        System.out.println(sum >= sc.nextInt() ? "AKIOI" : "AFO");
        sc.close();
    }

}
