package com.luogu.algorithm.p1534;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumi = 0;
        int sum = 0;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n <= 3000) {
            for (int i = 0; i < n; i++) {
                int x = cin.nextInt(), y = cin.nextInt();
                if (x <= 8) {
                    if (y <= 8) {
                        sumi += x+y-8;
                        sum += sumi;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
