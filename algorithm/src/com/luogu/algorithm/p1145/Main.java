package com.luogu.algorithm.p1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        boolean flag = false;
        int temp = num;
        while (!flag) {
            temp++;
            int next = 0;
            for (int i = 0; i < num; i++) {
                next = (next+temp-1) % (2*num-i);
                if (next < num) {
                    break;
                }
                if (i == num-1) {
                    flag = true;
                }
            }
        }
        System.out.println(temp);
    }
}
