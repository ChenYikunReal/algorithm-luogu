package com.luogu.algorithm.p1161;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), t, ans=0;
        double a;
        for (int i = 0; i < num; i++) {
            a = scanner.nextDouble();
            t = scanner.nextInt();
            for (int j = 1; j <= t; j++) {
                int x = (int)Math.floor(a*j);
                ans ^= x;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
