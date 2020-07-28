package com.luogu.algorithm.p5713;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  =scanner.nextInt();
        System.out.println((5*num < 3*num+11) ? "Local" : "Luogu");
        scanner.close();
    }
}
