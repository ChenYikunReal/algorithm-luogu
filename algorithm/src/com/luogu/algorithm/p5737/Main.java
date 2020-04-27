package com.luogu.algorithm.p5737;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt(), max = scanner.nextInt();
        scanner.close();
        int counter = 0;
        StringBuilder result = new StringBuilder();
        for (int i = min; i <= max; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                result.append(i).append(" ");
                counter++;
            }
        }
        System.out.println(counter + "\n" + result.toString().trim());
    }
}
