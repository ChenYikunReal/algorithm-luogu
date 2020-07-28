package com.luogu.algorithm.p5732;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int[][] array = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    array[i][j] = array[i-1][j];
                } else {
                    array[i][j] = array[i-1][j] + array[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < num; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                builder.append(array[i][j]).append(' ');
            }
            System.out.println(builder.toString().trim());
        }
    }
}
