package com.luogu.algorithm.p1317;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int[] array = new int[sum];
        for (int i = 0; i < sum; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        outer:
        for (int i = 0; i < sum-1; ) {
            if (array[i+1] < array[i]) {
                for (int j = i+1; j < sum; j++) {
                    if (j == sum-1) {
                        break outer;
                    } else if (array[j] < array[j+1]) {
                        i = j;
                        counter++;
                        break;
                    }
                }
            } else {
                i++;
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
