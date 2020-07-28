package com.luogu.algorithm.p1739;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();
        char[] arr = expression.toCharArray();
        int counter = 0;
        for (char c : arr) {
            if (c == 40) {
                counter++;
            } else if (c == 41) {
                if (counter <= 0) {
                    System.out.println("NO");
                    System.exit(0);
                } else {
                    counter--;
                }
            }
        }
        if (counter == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
