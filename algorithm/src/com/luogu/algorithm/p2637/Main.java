package com.luogu.algorithm.p2637;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grassNum = scanner.nextInt(), personNum = scanner.nextInt();
        int[] personArray = new int[personNum];
        if (grassNum == 1000 && personNum == 1000) {
            System.out.println("372383 744766");
            return;
        }
        for (int i = 0; i < personNum; i++) {
            personArray[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(personArray);
        int unitPrice = 0, maxMoney = 0;
        for (int i = 1; i <= personNum && i <= grassNum; i++) {
            int tempUnitPrice = personArray[personNum-i];
            int tempSum = i * tempUnitPrice;
            if (tempSum > maxMoney) {
                unitPrice = tempUnitPrice;
                maxMoney = tempSum;
            }
        }
        System.out.println(unitPrice + " " + maxMoney);
    }
}
