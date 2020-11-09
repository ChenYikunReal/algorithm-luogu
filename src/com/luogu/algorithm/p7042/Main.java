package com.luogu.algorithm.p7042;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x, y, k;
        long[] abcd = new long[4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                abcd[j] = scanner.nextLong();
            }
            Arrays.sort(abcd);
            if (abcd[0] + abcd[3] != abcd[1] + abcd[2]) {
                System.out.println(0);
            } else {
                x = abcd[0] == abcd[3] ? 1 : 4;
                y = abcd[1] == abcd[2] ? 1 : 4;
                k = abcd[0] == abcd[1] ? 2 : 1;
                System.out.println((x+y)/k);
            }
        }
        scanner.close();
    }

}
