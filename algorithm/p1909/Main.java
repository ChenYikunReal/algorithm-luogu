package com.luogu.algorithm.p1909;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < 3; i++) {
            int unitNum = scanner.nextInt(), unitPrice = scanner.nextInt();
            int num;
            if (studentNum % unitNum == 0) {
                num = studentNum / unitNum;
            } else {
                num = studentNum / unitNum + 1;
            }
            int temp = num * unitPrice;
            if (i == 0) {
                result = temp;
            } else if (temp < result) {
                result = temp;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
