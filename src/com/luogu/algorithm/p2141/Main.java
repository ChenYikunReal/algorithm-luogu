package com.luogu.algorithm.p2141;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        int[] counterArr = new int[num];
        for (int i = 0; i < num; i++) {
            int now = array[i];
            for (int j = 0; j < num; j++) {
                if (j == i) {
                    continue;
                }
                int num1 = array[j];
                for (int k = 0; k < num; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    int num2 = array[k];
                    if (num1 + num2 == now) {
                        counterArr[i] = 1;
                        break;
                    }
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (counterArr[i] == 1) {
                counter++;
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
