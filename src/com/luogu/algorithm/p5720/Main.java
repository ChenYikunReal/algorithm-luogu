package com.luogu.algorithm.p5720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.close();
        int counter = 1;
        while (length > 1) {
            length/=2;
            counter++;
        }
        System.out.println(counter);
    }
}
