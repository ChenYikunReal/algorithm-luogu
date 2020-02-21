package com.luogu.algorithm.p4136;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            System.out.println((num&1)==1 ? "Bob" : "Alice");
            num = scanner.nextInt();
        }
        scanner.close();
    }
}
