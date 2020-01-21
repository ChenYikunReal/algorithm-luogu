package com.luogu.algorithm.p2550;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] correctArray = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String str : correctArray) {
            set.add(str);
        }
        int[] resultArray = new int[7];
        for (int i = 0; i < num; i++) {
            int counter = 0;
            for (int j = 0; j < 7; j++) {
                if (set.contains(scanner.next())) {
                    counter++;
                }
            }
            if (counter != 0) {
                resultArray[7-counter]++;
            }
        }
        scanner.close();
        for (int i = 0; i < 6; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println(resultArray[6]);
    }
}
