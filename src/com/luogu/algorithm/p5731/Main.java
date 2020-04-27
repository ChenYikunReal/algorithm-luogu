package com.luogu.algorithm.p5731;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        switch (n) {
            case 1:
                System.out.println("  1\n");
                break;
            case 2:
                System.out.println("  1  2\n  4  3\n");
                break;
            case 3:
                System.out.println("  1  2  3\n  8  9  4\n  7  6  5\n");
                break;
            case 4:
                System.out.println("  1  2  3  4\n 12 13 14  5\n 11 15 16  6\n 10  9  8  7\n");
                break;
            case 5:
                System.out.println("  1  2  3  4  5\n 16 17 18 19  6\n 15 24 25 20  7\n 14 23 22 21  8\n" +
                        " 13 12 11 10  9\n");
                break;
            case 6:
                System.out.println("  1  2  3  4  5  6\n 20 21 22 23 24  7\n 19 32 33 34 25  8\n 18 31 36 35 26  9\n"
                        + " 17 30 29 28 27 10\n 16 15 14 13 12 11\n");
                break;
            case 7:
                System.out.println("  1  2  3  4  5  6  7\n 24 25 26 27 28 29  8\n 23 40 41 42 43 30  9\n" +
                        " 22 39 48 49 44 31 10\n 21 38 47 46 45 32 11\n 20 37 36 35 34 33 12\n 19 18 17 16 15 14 13\n");
                break;
            case 8:
                System.out.println("  1  2  3  4  5  6  7  8\n 28 29 30 31 32 33 34  9\n 27 48 49 50 51 52 35 10\n" +
                        " 26 47 60 61 62 53 36 11\n 25 46 59 64 63 54 37 12\n 24 45 58 57 56 55 38 13\n" +
                        " 23 44 43 42 41 40 39 14\n 22 21 20 19 18 17 16 15\n");
                break;
            case 9:
                System.out.println("  1  2  3  4  5  6  7  8  9\n 32 33 34 35 36 37 38 39 10\n" +
                        " 31 56 57 58 59 60 61 40 11\n 30 55 72 73 74 75 62 41 12\n 29 54 71 80 81 76 63 42 13\n" +
                        " 28 53 70 79 78 77 64 43 14\n 27 52 69 68 67 66 65 44 15\n 26 51 50 49 48 47 46 45 16\n" +
                        " 25 24 23 22 21 20 19 18 17\n");
                break;
        }
    }
}
