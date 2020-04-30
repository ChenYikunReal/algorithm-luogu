package com.luogu.algorithm.p5738;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        double max_sum = 0.0;
        for (int i = 0; i < n; i++) {
            int sum_temp = scanner.nextInt(), max_temp = sum_temp, min_temp = sum_temp;
            for (int j = 1; j < m; j++) {
                int temp = scanner.nextInt();
                if (temp > max_temp) {
                    max_temp = temp;
                } else if (temp < min_temp) {
                    min_temp = temp;
                }
                sum_temp += temp;
            }
            sum_temp -= max_temp;
            sum_temp -= min_temp;
            max_sum = Math.max(max_sum, (double)sum_temp/(m-2));
        }
        scanner.close();
        System.out.printf("%.2f", max_sum);
    }
}
