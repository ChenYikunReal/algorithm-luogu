package com.luogu.algorithm.p1031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), sum = 0, average = 0, counter = 0;
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            sum += temp;
            array[i] = temp;
        }
        scanner.close();
        average = sum / num;
        for(int i = 0; i < num; i++) {
            int temp = array[i] - average;
            if(temp != 0) {
                array[i+1] += temp;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
