package com.luogu.algorithm.p1548;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt(), x = scanner.nextInt();
        scanner.close();
        int square = 0, rectangle = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int k = i+1; k <= x; k++) {
                    for (int l = j+1; l <= y; l++) {
                        if (k-i == l-j) {
                            square++;
                        } else {
                            rectangle++;
                        }
                    }
                }
            }
        }
        System.out.println(square + " " + rectangle);
    }
}
