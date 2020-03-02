package com.luogu.algorithm.p1202;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] week = new int[8];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        Calendar time = Calendar.getInstance();
        for (int i = 1900; i < 1900+num; i++) {
            for (int j = 0; j < 12; j++) {
                time.set(i, j, 13);
                week[time.get(Calendar.DAY_OF_WEEK)]++;
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(week[7]);
        for (int i = 1; i <= 6; i++) {
            result.append(" ").append(week[i]);
        }
        System.out.println(result);
    }
}
