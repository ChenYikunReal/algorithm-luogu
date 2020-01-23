package com.luogu.algorithm.p5660;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        char[] arr = line.toCharArray();
        int counter = 0;
        for (char c : arr) {
            if (c == 49) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
