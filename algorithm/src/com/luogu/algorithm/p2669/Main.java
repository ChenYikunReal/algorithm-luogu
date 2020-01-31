package com.luogu.algorithm.p2669;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int sum = 0, tempCount = 0, tempMoney = 1;
        for (int i = 0; i < num; i++) {
            if (tempCount == tempMoney) {
                tempCount = 0;
                tempMoney++;
            }
            tempCount++;
            sum += tempMoney;
        }
        System.out.println(sum);
    }
}
