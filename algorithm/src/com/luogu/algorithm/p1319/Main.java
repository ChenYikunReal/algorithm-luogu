package com.luogu.algorithm.p1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str_array = scanner.nextLine().split("\\s+");
        scanner.close();
        int num = Integer.parseInt(str_array[0]);
        boolean zero = true;
        StringBuilder tempString = new StringBuilder();
        for (int i = 1; i < str_array.length; i++) {
            int tempNum = Integer.parseInt(str_array[i]);
            if (zero) {
                for (int j = 0; j < tempNum; j++) {
                    tempString.append(0);
                    if (tempString.length() == num) {
                        System.out.println(tempString);
                        tempString = new StringBuilder();
                    }
                }
            } else {
                for (int j = 0; j < tempNum; j++) {
                    tempString.append(1);
                    if (tempString.length() == num) {
                        System.out.println(tempString);
                        tempString = new StringBuilder();
                    }
                }
            }
            //改变下一次的标记
            if (zero) {
                zero = false;
            } else {
                zero = true;
            }
        }
    }
}
