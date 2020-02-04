package com.luogu.algorithm.p5613;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt(), sum = 0, timer = 0;
        for (int i = 0; i < k; i++) {
            set.add(scanner.nextInt());
        }
        scanner.close();
        while (sum < n) {
            sum += m;
            if (set.contains(sum)) {
                m++;
            }
            timer++;
        }
        System.out.println(timer);
    }
}
