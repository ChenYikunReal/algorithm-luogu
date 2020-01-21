package com.luogu.algorithm.p2708;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        scanner.close();
        int length = chars.length, counter = 0;
        for (int i = 1; i < length; i++) {
            if (chars[i] != chars[i-1]) {
                counter++;
            }
        }
        if (chars[length-1] == '0') {
            counter++;
        }
        System.out.println(counter);
    }
}
