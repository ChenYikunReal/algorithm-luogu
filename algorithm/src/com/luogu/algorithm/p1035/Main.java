package com.luogu.algorithm.p1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = 1;
        double sum = 0.0;
        while (sum <= k) {
            sum += (double)1/n;
            if (sum <= k) {
                n++;
            }
        }
        System.out.println(n);
        scanner.close();
    }
}
