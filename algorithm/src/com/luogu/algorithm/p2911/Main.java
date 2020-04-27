package com.luogu.algorithm.p2911;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int[] array = new int[a+b+c+1];
        for (byte i = 1; i <= a; i++) {
            for (byte j = 1; j <= b; j++) {
                for (byte k = 1; k <= c; k++) {
                    array[i+j+k]++;
                }
            }
        }
        scanner.close();
        int max = 0, i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                i = j;
            }
        }
        System.out.println(i);
    }
}
