package com.luogu.algorithm.p2615;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int[][] array = new int[num][num];
        int last_x = 0, last_y = num/2;
        //肯定是奇数
        array[0][last_y] = 1;
        for (int i = 2; i <= num*num; i++) {
            if (last_x == 0 && last_y != num-1) {
                last_x = num-1;
                ++last_y;
            } else if (last_x != 0 && last_y == num-1) {
                --last_x;
                last_y = 0;
            } else if (last_x == 0 && last_y == num-1) {
                ++last_x;
            } else if (array[last_x-1][last_y+1] == 0) {
                --last_x;
                ++last_y;
            } else {
                ++last_x;
            }
            array[last_x][last_y] = i;
        }
        StringBuilder result;
        for (int i = 0; i < num; i++) {
            result = new StringBuilder();
            for (int j = 0; j < num; j++) {
                result.append(array[i][j]).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
