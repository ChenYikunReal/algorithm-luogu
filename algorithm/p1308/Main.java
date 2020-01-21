package com.luogu.algorithm.p1308;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        String text = scanner.nextLine();
        System.out.println(text.indexOf(pattern));
        scanner.close();
    }
}
