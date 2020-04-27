package com.luogu.algorithm.p5716;

import java.util.Scanner;

public class Main {

    private static int getDayNumber(boolean isLeapYear, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    private static boolean judgeLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(), month = scanner.nextInt();
        scanner.close();
        System.out.println(getDayNumber(judgeLeapYear(year), month));
    }
}
