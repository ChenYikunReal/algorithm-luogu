package com.luogu.algorithm.p4613;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] x_array = new int[num], y_array = new int[num];
        for (int i = 0; i < num; i++) {
            x_array[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            y_array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(x_array);
        Arrays.sort(y_array);
        for (int i = 0; i < num; i++) {
            if (x_array[i] > y_array[i]) {
                System.out.println("NE");
                return;
            }
        }
        System.out.println("DA");
    }
}
