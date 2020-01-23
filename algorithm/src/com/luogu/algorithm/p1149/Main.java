package com.luogu.algorithm.p1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[2001], c = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        for (int i = 0; i < 2001; i++) {
            a[i] = 6;
        }
        int s = 0, j;
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= 2000; i++) {
            j = i;
            //求每个数所用的火柴棒
            while(j >= 1) {
                a[i] += c[j%10];
                j /= 10;
            }
        }
        for(int i = 0; i <= 1000; i++) {
            for(int k = 0; k <= 1000; k++) {
                if(a[i] + a[k] + a[i+k] + 4 == b) {
                    s++;//还有加号与等号
                }
            }
        }
        System.out.println(s);
    }
}
