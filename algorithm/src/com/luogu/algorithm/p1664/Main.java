package com.luogu.algorithm.p1664;

import java.util.Scanner;

public class Main {

    public static int getReward(int counter) {
        if (counter < 3) {
            return 1;
        } else if (counter < 7) {
            return 2;
        } else if (counter < 30) {
            return 3;
        } else if (counter < 120) {
            return 4;
        } else if (counter < 365) {
            return 5;
        } else {
            return 6;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int zero_num = 0, counter = 0, result = 0;
        for (int i = 0; i < num; i++) {
            int now = scanner.nextInt();
            if (now == 1) {
                if (zero_num != 0) {
                    counter -= Math.pow(2, zero_num-1);
                    zero_num = 0;
                    if (counter < 0) {
                        counter = 0;
                    }
                }
                counter++;
                result += getReward(counter);
            } else {    //0
                zero_num++;
            }
        }
        scanner.close();
        System.out.println(result);
    }
}
