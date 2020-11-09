package com.luogu.algorithm.p6320;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), w = scanner.nextInt(), h = scanner.nextInt(), cmp = (int)Math.sqrt(w*w+h*h), temp;
        for (int i = 0; i < n; i++) {
            System.out.println(scanner.nextInt() <= cmp ? "DA" : "NE");
        }
        scanner.close();
    }

}
