package com.luogu.algorithm.p1146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int[] coins = new int[num];
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i != j){
                    coins[j] ^= 1;
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < num; j++) {
                builder.append(coins[j]);
            }
            System.out.println(builder);
        }
    }
}
