package com.luogu.algorithm.p6386;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt(),
                p = scanner.nextInt(), m = scanner.nextInt(), g = scanner.nextInt(), counter = 0;
        if (p % (a+b) <= a && p % (a+b) > 0) {
            counter++;
        }
        if (p % (c+d) <= c && p % (c+d) > 0) {
            counter++;
        }
        System.out.println(counter == 0 ? "none" : counter == 1 ? "one" : "both");
        counter = 0;
        if (m % (a+b) <= a && m % (a+b) > 0) {
            counter++;
        }
        if (m % (c+d) <= c && m % (c+d) > 0) {
            counter++;
        }
        System.out.println(counter == 0 ? "none" : counter == 1 ? "one" : "both");
        counter = 0;
        if (g % (a+b) <= a && g % (a+b) > 0) {
            counter++;
        }
        if (g % (c+d) <= c && g % (c+d) > 0) {
            counter++;
        }
        System.out.println(counter == 0 ? "none" : counter == 1 ? "one" : "both");
        scanner.close();
    }

}
