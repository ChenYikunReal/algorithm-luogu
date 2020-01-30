package com.luogu.algorithm.p1201;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new HashMap<>(5);
        String[] array = new String[num];
        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            map.put(name, 0);
            array[i] = name;
        }
        for (int i = 0; i < num; i++) {
            String temp = scanner.nextLine();
            int tempMoney = scanner.nextInt(), tempNum = scanner.nextInt();
            scanner.nextLine();
            if (tempNum != 0) {
                tempMoney /= tempNum;
                map.put(temp, map.get(temp) - tempMoney * tempNum);
                for (int j = 0; j < tempNum; j++) {
                    String tempName = scanner.nextLine();
                    map.put(tempName, map.get(tempName) + tempMoney);
                }
            }
        }
        scanner.close();
        for (String s : array) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
