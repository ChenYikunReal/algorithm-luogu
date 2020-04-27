package com.luogu.algorithm.p3717;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt(), num = scanner.nextInt(), radius = scanner.nextInt(), counter = 0;
        byte[][] array = new byte[range][range];
        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt()-1, y = scanner.nextInt()-1;
            for (int j = 0; j < range; j++) {
                for (int k = 0; k < range; k++) {
                    if (array[j][k] == 0 && Math.pow((x-j), 2) + Math.pow((y-k), 2) <= Math.pow(radius, 2)) {
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
