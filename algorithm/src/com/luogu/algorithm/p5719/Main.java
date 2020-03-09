package com.luogu.algorithm.p5719;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt(), counter1 = 0, counter2 = 0, sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                counter1++;
                sum1 += i;
            } else {
                counter2++;
                sum2 += i;
            }
        }
        scanner.close();
        System.out.printf("%.1f %.1f", ((double)sum1/counter1), ((double)sum2/counter2));
    }
}
