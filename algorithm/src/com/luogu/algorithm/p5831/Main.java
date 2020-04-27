package com.luogu.algorithm.p5831;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt(), num = scanner.nextInt(), counter = 0;
        int[] array = new int[21];
        boolean book[][] = new boolean[21][21];
        for (int p = line; p > 0; p--) {
            for(int i = 1; i <= num; i++) {
                array[i] = scanner.nextInt();
            }
            for(int i = 1; i <= num; i++) {
                book[array[i]][array[i]] = true;
            }
            for(int i = 1; i <= num; i++) {
                for(int j = i+1; j <= num; j++) {
                    book[array[j]][array[i]] = true;
                }
            }
        }
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(!book[i][j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
