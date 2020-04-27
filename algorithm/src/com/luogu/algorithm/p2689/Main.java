package com.luogu.algorithm.p2689;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        int x = x2 - x1, y = y2 - y1, result = Math.abs(x) + Math.abs(y);
        int num = scanner.nextInt();
        for (int i = 0; i < num && !(x == 0 && y == 0); i++) {
            String next = scanner.next();
            switch (next) {
                case "E":
                    if (x > 0) {
                        x--;
                    }
                    break;
                case "W":
                    if (x < 0) {
                        x++;
                    }
                    break;
                case "N":
                    if (y > 0) {
                        y--;
                    }
                    break;
                default:
                    if (y < 0) {
                        y++;
                    }
                    break;
            }
        }
        scanner.close();
        if (x == 0 && y == 0) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
