package com.luogu.algorithm.p1847;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short times = scanner.nextShort(), num = scanner.nextShort();
        long[] x1_array = new long[times+1];
        long[] y1_array = new long[times+1];
        long[] x2_array = new long[times+1];
        long[] y2_array = new long[times+1];
        for (int i = 1; i <= times; i++) {
            x1_array[i] = scanner.nextLong();
            y1_array[i] = scanner.nextLong();
            x2_array[i] = scanner.nextLong();
            y2_array[i] = scanner.nextLong();
        }
        for (short i = 0; i < num; i++) {
            long x0 = scanner.nextLong(), y0 = scanner.nextLong();
            short counter = 0, last = 0;
            for (short j = times; j > 0; j--) {
                if (x2_array[j] >= x0 && x1_array[j] <= x0 && y2_array[j] >= y0 && y1_array[j] <= y0) {
                    counter++;
                    if (last == 0) {
                        last = j;
                    }
                }
            }
            if (counter == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES " + counter + " " + last);
            }
        }
        scanner.close();
    }
}
