package com.luogu.algorithm.p6321;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(), c = scanner.nextInt(), zr = scanner.nextInt(), zc = scanner.nextInt();
        scanner.nextLine();
        StringBuilder builder;
        for (int i = 0; i < r; i++) {
            builder = new StringBuilder();
            for (char ch : scanner.nextLine().toCharArray()) {
                for (int j = 0; j < zc; j++) {
                    builder.append(ch);
                }
            }
            for (int j = 0; j < zr; j++) {
                System.out.println(builder);
            }
        }
        scanner.close();
    }

}
