package com.luogu.algorithm.test.find_left_num;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int arrayCount(int[] array, int num) {
        int[] newArray = new int[num+2];
        for (int i = 0; i < num; i++) {
            newArray[array[i]]++;
        }
        for (int i = 1; i < num+2; i++) {
            if (newArray[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int sortAndFind(int[] array, int num) {
        Arrays.sort(array);
        int prev = array[0];
        if (prev == 2) {
            return 1;
        }
        for (int i = 1; i < num; i++) {
            if (array[i] != ++prev) {
                return i+1;
            }
        }
        return -1;
    }

    private static int sumAndFind(int[] array, int num) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (num+2)*(num+1)/2-sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(arrayCount(array, num));
        System.out.println(sortAndFind(array, num));
        System.out.println(sumAndFind(array, num));
    }

}
