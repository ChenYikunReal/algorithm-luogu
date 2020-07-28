package com.luogu.algorithm.p1125;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] count = new int[26];
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        for (char c : word.toCharArray()) {
            count[c-'a']++;
        }
        Arrays.sort(count);
        int num = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                num = count[25]-count[i];
                break;
            }
        }
        if (num == 0 || num == 1) {
            System.out.println("No Answer\n0");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("No Answer\n0");
                return;
            }
        }
        System.out.println("Lucky Word");
        System.out.println(num);
    }
}
