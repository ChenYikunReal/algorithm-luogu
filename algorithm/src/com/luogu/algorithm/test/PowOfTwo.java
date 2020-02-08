package com.luogu.algorithm.test;

import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if ((n & n-1) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
