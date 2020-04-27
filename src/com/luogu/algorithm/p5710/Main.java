package com.luogu.algorithm.p5710;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        boolean flag1 = num % 2 == 0, flag2 = num > 4 && num <= 12;
        //小A
        if (flag1 && flag2) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        //Uim
        if (flag1 || flag2) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        //八尾勇
        //(flag1 && !flag2) || (!flag1 && flag2)
        if (flag1^flag2) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        //正妹
        if (!flag1 && !flag2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
