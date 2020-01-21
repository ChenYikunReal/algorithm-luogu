package com.luogu.algorithm.p1652;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] x_array = new int[num];
        int[] y_array = new int[num];
        int[] radius_array = new int[num];
        for (int i = 0; i < num; i++) {
            x_array[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            y_array[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            radius_array[i] = scanner.nextInt();
        }
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        scanner.close();
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (Math.pow((x1 - x_array[i]), 2) + Math.pow(y1 - y_array[i], 2) <= Math.pow(radius_array[i], 2)) {
                if (!(Math.pow((x2 - x_array[i]), 2) + Math.pow(y2 - y_array[i], 2) <= Math.pow(radius_array[i], 2))) {
                    counter++;
                }
            } else {
                if (Math.pow((x2 - x_array[i]), 2) + Math.pow(y2 - y_array[i], 2) <= Math.pow(radius_array[i], 2)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
