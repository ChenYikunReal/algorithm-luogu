package com.luogu.algorithm.p1634;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long sum = 1L;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        scan.close();
        if (a > 0) {
            if (b > 0) {
                for (int i = 0; i < b; i++) {
                    sum += sum*a;
                }
            }
        }
        System.out.println(sum);
    }

}

