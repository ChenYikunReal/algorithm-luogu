package com.luogu.algorithm.p1150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt(), per = scanner.nextInt(), left = num % per, count, sum = 0;
        do {
            count = num / per;
            sum += count * per;
            num = left + count;
            left = num % per;
        } while (num >= per);
        sum += left;
        System.out.println(sum);
        scanner.close();
    }
}
