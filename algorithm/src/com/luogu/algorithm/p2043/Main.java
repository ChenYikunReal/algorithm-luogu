package com.luogu.algorithm.p2043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num+1];
        for (int i = 2; i <= num; i++) {
            int temp = i;
            for (int j = 2; j <= i; j++) {
                while (temp % j == 0) {
                    array[j]++;
                    temp /= j;
                }
            }
        }
        for (int i = 1; i <= num;i++) {
            if (array[i]!=0) {
                System.out.println(i + " " + array[i]);
            }
        }
        scanner.close();
    }
}
