package com.luogu.algorithm.p1047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int lineNum = scanner.nextInt();
        int counter = 0;
        //注意树维L+1棵
        int[] array = new int[length+1];
        for (int i = 0; i < lineNum; i++) {
            int from = scanner.nextInt(), to = scanner.nextInt();
            for (int j = from; j <= to; j++) {
                array[j] = 1;
            }
        }
        for (int i = 0; i <= length; i++) {
            if (array[i] == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
