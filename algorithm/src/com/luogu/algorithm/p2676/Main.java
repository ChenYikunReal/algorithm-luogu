package com.luogu.algorithm.p2676;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), height = scanner.nextInt(), sum = 0, j;
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array);
        for (j = num-1; j >= 0 && sum < height; j--) {
            sum += array[j];
        }
        System.out.println(num-j-1);
    }
}
