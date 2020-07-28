package com.luogu.algorithm.p4956;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;; i++) {
            for (int j = 100 ; j > 0; j--) {
                if ((7*j + 21*i) * 52 == n) {
                    System.out.println(j);
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
