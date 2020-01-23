package com.luogu.algorithm.p1428;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int[] result = new int[n];
        int m;
        int count;
        for (int i = 0; i < n; i++) {
            m = scan.nextInt();
            array [i] = m;
            count = 0;
            for (int j = i; j>=0; j--) {
                if (array [i] > array [j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
        scan.close();
    }

}

