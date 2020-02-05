package com.luogu.algorithm.p2241;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong(), n = scanner.nextLong();
        scanner.close();
        long rectangle = (m*(m+1)/2)*(n*(n+1)/2), square = 0;
        for (long i = 1; i <= Math.min(m, n); i++) {
            square += (n-i+1)*(m-i+1);
        }
        System.out.println(square + " " + (rectangle-square));
    }
}
