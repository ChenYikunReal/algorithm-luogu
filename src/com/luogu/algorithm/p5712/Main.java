package com.luogu.algorithm.p5712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String prev = "Today, I ate ";
        String rear = " apple";
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if (num < 2) {
            prev = prev + num + rear;
        } else {
            prev = prev + num + rear + "s";
        }
        System.out.println(prev + ".");
    }
}
