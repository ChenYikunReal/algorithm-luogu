package com.luogu.algorithm.p1615;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int numPerSecond = scanner.nextInt();
        scanner.close();
        String[] strArr1 = str1.split(":");
        String[] strArr2 = str2.split(":");
        long hour1 = Integer.parseInt(strArr1[0]);
        long hour2 = Integer.parseInt(strArr2[0]);
        long minute1 = Integer.parseInt(strArr1[1]);
        long minute2 = Integer.parseInt(strArr2[1]);
        long second1 = Integer.parseInt(strArr1[2]);
        long second2 = Integer.parseInt(strArr2[2]);
        long counter = ((hour2-hour1)*3600 + (minute2-minute1)*60 + (second2-second1))*numPerSecond;
        System.out.println(counter);
    }
}
