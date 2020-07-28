package com.luogu.algorithm.p5726;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] grades = new int[num];
        for (int i = 0; i < num; i++) {
            grades[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(grades);
        int sum = 0;
        for (int i = 1; i < num-1; i++) {
            sum += grades[i];
        }
        System.out.printf("%.2f", ((double)sum/(num-2)));
    }
}
