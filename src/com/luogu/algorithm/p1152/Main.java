package com.luogu.algorithm.p1152;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Set<Integer> set = new HashSet<>(1000);
        int prev = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            int temp = scanner.nextInt(), abs = Math.abs(prev-temp);
            if (abs >= num || set.contains(abs)) {
                System.out.println("Not jolly");
                return;
            } else {
                prev = temp;
                set.add(abs);
            }
        }
        scanner.close();
        System.out.println("Jolly");
    }
}
