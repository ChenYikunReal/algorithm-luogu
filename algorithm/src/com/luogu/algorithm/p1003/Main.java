package com.luogu.algorithm.p1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] array = new int[num][4];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int x = scanner.nextInt(), y = scanner.nextInt();
        scanner.close();
        int i;
        for (i = num-1; i >= 0; i--) {
            if (array[i][0] <= x && array[i][1] <= y && array[i][0]+array[i][2] >= x && array[i][1]+array[i][3] >= y) {
                System.out.println(i+1);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
