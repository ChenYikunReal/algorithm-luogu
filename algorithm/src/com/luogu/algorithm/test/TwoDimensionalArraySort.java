package com.luogu.algorithm.test;

import java.util.Arrays;
import java.util.Comparator;

public class TwoDimensionalArraySort {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (5 - j)*(4 - i);
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < 4; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(array.length);
    }
}
