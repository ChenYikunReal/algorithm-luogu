package com.luogu.algorithm.p2956;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x_range = scanner.nextInt(), y_range = scanner.nextInt(), num = scanner.nextInt(), counter = 0;
        int[][] array = new int[x_range+1][y_range+1];
        for (int i = 0; i < num; i++) {
            int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <=y2; k++) {
                    if (array[j][k] == 0) {
                        array[j][k] = 1;
                        counter++;
                    }
                }
            }
        }
        scanner.close();
        System.out.println(counter);
    }
}
