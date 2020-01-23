package com.luogu.algorithm.p1420;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 1;
        int tmp = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1 && n <= 10000) {
            int[] number = new int[n+1];
            for (int i = 0; i < n; i++) {
                number[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (number[i+1] - number[i] == 1)
                    tmp++;
                else
                    tmp = 1;
                if (tmp > max)
                    max = tmp;
            }
        }
        System.out.println(max);
        scan.close();
    }
}