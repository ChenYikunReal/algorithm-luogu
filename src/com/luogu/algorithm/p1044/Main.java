package com.luogu.algorithm.p1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int[] catalan = new int[num+1];
        catalan[0] = 1;
        catalan[1] = 1;
        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += (catalan[j] * catalan[i-j-1]);
            }
        }
        System.out.println(catalan[num]);
    }
}
