package com.luogu.algorithm.p1424;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fromDay = scanner.nextInt(), dayNum = scanner.nextInt();
        int weekdayNum = dayNum / 7 * 5;
        int leftNum = dayNum % 7;
        if (leftNum > 0) {
            if (leftNum + fromDay == 7 || fromDay == 7) {
                leftNum -= 1;
            } else if (leftNum + fromDay >= 8) {
                leftNum -= 2;
            }
        }
        System.out.println((weekdayNum + leftNum) * 250);
        scanner.close();
    }
}
