package com.luogu.algorithm.p1296;

import java.util.Arrays;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num+2];
        int distance = scanner.nextInt(), max = 2, result = 0;
        for(int i = 1; i <= num; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array, 1, num+1);
        for(int i = 1; i < num; i++) {
            while(max <= num && array[max]-array[i] <= distance) {
                max++;
            }
            max--;
            result += (max-i);
        }
        System.out.println(result);
    }
}
