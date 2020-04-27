package com.luogu.algorithm.p1089;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mom = 0;
        int jinjin = 0;
        int month = 0;
        for (int i = 1; i <= 12; i++) {
            int temp = scanner.nextInt();
            jinjin += 300;
            jinjin -= temp;
            if (jinjin < 0) {
                month = i;
                break;
            } else if (jinjin > 100) {
                mom += jinjin / 100;
                jinjin %= 100;
            }
        }
        if (month > 0) {
            System.out.println(-month);
        } else {
            jinjin += (int)(mom * 120);
            System.out.println(jinjin);
        }
        scanner.close();
    }
}
