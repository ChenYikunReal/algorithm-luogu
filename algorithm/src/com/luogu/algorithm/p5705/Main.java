package com.luogu.algorithm.p5705;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        scanner.close();
    }
}
