package com.luogu.algorithm.p1614;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), range = scanner.nextInt(), sum = 0, pointer = 0, tempSum;
        int[] array = new int[range];
        for (int i = 0; i < range; i++) {
            int temp = scanner.nextInt();
            sum += temp;
            array[i] = temp;
        }
        tempSum = sum;
        for (int i = range; i < num; i++) {
            int temp = scanner.nextInt();
            tempSum = tempSum - array[pointer] + temp;
            array[pointer] = temp;
            pointer = (pointer+1)%range;
            if (tempSum < sum) {
                sum = tempSum;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}
