package com.luogu.algorithm.p1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        int height = scanner.nextInt() + 30;
        for (int i = 0; i < 10; i++) {
            if (array[i] <= height) {
                counter++;
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
