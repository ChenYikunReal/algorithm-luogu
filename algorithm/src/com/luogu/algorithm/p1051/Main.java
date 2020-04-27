package com.luogu.algorithm.p1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String maxName = "";
        int maxMoney = 0;
        int sumMoney = 0;
        for (int i = 0; i < num; i++) {
            String[] infoList = scanner.nextLine().split(" ");
            String name = infoList[0];
            int finalGrade = Integer.parseInt(infoList[1]);
            int classGrade = Integer.parseInt(infoList[2]);
            boolean isLeader = "Y".equals(infoList[3]);
            boolean isWest = "Y".equals(infoList[4]);
            int paperNumber = Integer.parseInt(infoList[5]);
            int tempMoney = 0;
            if (finalGrade > 80 && paperNumber >= 1) {
                tempMoney += 8000;
            }
            if (finalGrade > 85 && classGrade > 80) {
                tempMoney += 4000;
            }
            if (finalGrade > 90) {
                tempMoney += 2000;
            }
            if (finalGrade > 85 && isWest) {
                tempMoney += 1000;
            }
            if (classGrade > 80 && isLeader) {
                tempMoney += 850;
            }
            if (tempMoney > maxMoney) {
                maxMoney = tempMoney;
                maxName = name;
            }
            sumMoney += tempMoney;
        }
        scanner.close();
        System.out.println(maxName + "\n" + maxMoney + "\n" + sumMoney);
    }
}
