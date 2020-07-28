package com.luogu.algorithm.p5594;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short studentNum = scanner.nextShort();
        short pageNum = scanner.nextShort();
        short dayNum = scanner.nextShort();
        short[][] dayArray = new short[dayNum][pageNum];
        for (int i = 0; i < studentNum; i++) {
            for (int j = 0; j < pageNum; j++) {
                int temp = scanner.nextInt();
                dayArray[temp-1][j]++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dayNum-1; i++) {
            short count = 0;
            for (int j = 0; j < pageNum; j++) {
                if (dayArray[i][j] != 0) {
                    count++;
                }
            }
            result.append(count).append(" ");
        }
        short count = 0;
        for (int j = 0; j < pageNum; j++) {
            if (dayArray[dayNum-1][j] != 0) {
                count++;
            }
        }
        result.append(count);
        System.out.println(result);
        scanner.close();
    }
}
