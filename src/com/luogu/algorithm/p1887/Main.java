package com.luogu.algorithm.p1887;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        int mod = m % n;
        int division = m / n;
        StringBuilder result = new StringBuilder();
        for (int i = mod; i < n; i++) {
            result.append(division).append(" ");
        }
        division++;
        for (int i = 0; i < mod; i++) {
            result.append(division).append(" ");
        }
        scanner.close();
        System.out.println(result.toString().trim());
    }
}
