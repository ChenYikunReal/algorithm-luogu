package com.luogu.algorithm.p6330;

import static java.lang.Math.max;
import static java.lang.Math.min;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt(),
                x3 = scanner.nextInt(), y3 = scanner.nextInt();
        scanner.close();
        System.out.println((x1+x2+x3-(x1+x2+x3-max(x1, max(x2, x3))-min(x1, min(x2, x3)))*2) + " " + (y1+y2+y3-(y1+y2+y3-max(y1, max(y2, y3))-min(y1, min(y2, y3)))*2));
    }

}
