package com.luogu.algorithm.p5729;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte(), y = scanner.nextByte(), z = scanner.nextByte(), num = scanner.nextByte();
        byte[][][] cuboid = new byte[x+1][y+1][z+1];
        for (byte i = 0; i < num; i++) {
            byte x1 = scanner.nextByte(), y1 = scanner.nextByte(), z1 = scanner.nextByte();
            byte x2 = scanner.nextByte(), y2 = scanner.nextByte(), z2 = scanner.nextByte();
            for (byte j = x1; j <= x2; j++) {
                for (byte k = y1; k <= y2; k++) {
                    for (byte l = z1; l <= z2; l++) {
                        cuboid[j][k][l] = 1;
                    }
                }
            }
        }
        scanner.close();
        int counter = 0;
        for (byte i = 1; i <= x; i++) {
            for (byte j = 1; j <= y; j++) {
                for (byte k = 1; k <= z; k++) {
                    if (cuboid[i][j][k] == 0) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
