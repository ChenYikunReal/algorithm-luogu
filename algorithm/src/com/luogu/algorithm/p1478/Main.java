package com.luogu.algorithm.p1478;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), strength = scanner.nextInt(), maxHeight = scanner.nextInt()+scanner.nextInt();
        int[] array = new int[101];
        for (int i = 0; i < num; i++) {
            int tempHeight = scanner.nextInt(), needStrength = scanner.nextInt();
            if (tempHeight <= maxHeight) {
                array[needStrength]++;
            }
        }
        scanner.close();
        int counter = 0, sum = 0;
        outer:
        for (int i = 0; i <= 100; i++) {
            while (array[i] > 0) {
                sum += i;
                if (sum <= strength) {
                    counter++;
                    array[i]--;
                } else {
                    break outer;
                }
            }
        }
        System.out.println(counter);
    }
}
