package com.luogu.algorithm.p2651;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static long gcd(long a,long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            int num = scanner.nextInt();
            long a1 = scanner.nextLong();
            long a2 = scanner.nextLong();
            long gcd = gcd(a1, a2);
            if (a2 % gcd == 0) {
                a2  /= gcd(a1, a2);
            }
            int j;
            for (j = 2; j < num && a2 > 1; j++) {
                long aj = scanner.nextLong();
                gcd = gcd(aj, a2);
                if (a2 % gcd == 0) {
                    a2 /= gcd;
                }
            }
            for (; j < num; j++) {
                scanner.nextInt();
            }
            if (a2 == 1) {
                list.add("Yes");
            } else {
                list.add("No");
            }
        }
        scanner.close();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
