package com.luogu.algorithm.p1830;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte(), m = scanner.nextByte(), x = scanner.nextByte(), y = scanner.nextByte();
        byte[][] last_reminder = new byte[n+1][m+1];
        byte[][] counter_graph = new byte[n+1][m+1];
        for (byte i = 1; i <= x; i++) {
            byte x1 = scanner.nextByte(), y1 = scanner.nextByte(), x2 = scanner.nextByte(), y2 = scanner.nextByte();
            for (byte j = x1; j <= x2; j++) {
                for (byte k = y1; k <= y2; k++) {
                    last_reminder[j][k] = i;
                    counter_graph[j][k]++;
                }
            }
        }
        for (byte i = 0; i < y; i++) {
            byte x0 = scanner.nextByte(), y0 = scanner.nextByte();
            if (counter_graph[x0][y0] == 0) {
                System.out.println("N");
            } else {
                System.out.println("Y " + counter_graph[x0][y0] + " " + last_reminder[x0][y0]);
            }
        }
        scanner.close();
    }
}
