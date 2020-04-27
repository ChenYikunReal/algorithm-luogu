package com.luogu.algorithm.p1094;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt(), num = scanner.nextInt();
        int[] gifts = new int[num];
        for (int i = 0; i < num; i++) {
            gifts[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(gifts);
        int counter= 0, i = 0, j = num-1;
        while (i < j) {
            if (gifts[i] + gifts[j] > limit) {
                --j;
                ++counter;
            } else {
                ++i;
                --j;
                ++counter;
            }
        }
        if (i == j) {
            ++counter;
        }
        System.out.println(counter);
    }
}
