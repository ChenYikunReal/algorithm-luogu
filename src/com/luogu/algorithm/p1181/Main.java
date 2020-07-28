package com.luogu.algorithm.p1181;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), max = scanner.nextInt(), counter = 0, tempSum = 0, tempNum = 0;
        for (int i = 0; i < num; i++) {
            tempNum = scanner.nextInt();
            if (tempNum + tempSum <= max) {
                tempSum += tempNum;
            } else {
                counter++;
                tempSum = tempNum;
            }
        }
        if (tempSum != 0) {
            counter++;
        }
        scanner.close();
        System.out.println(counter);
    }
}
