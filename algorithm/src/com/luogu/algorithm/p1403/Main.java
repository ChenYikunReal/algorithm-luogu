package com.luogu.algorithm.p1403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int result = 0;
        for(int i = 1, j; i <= num; i = j+1) {
            j = num/(num/i);
            result += (num/i)*(j-i+1);
        }
        System.out.println(result);
    }
}
