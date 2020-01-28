package com.luogu.algorithm.p1138;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), k = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            set.add(scanner.nextInt());
        }
        scanner.close();
        if (k > set.size()) {
            System.out.println("NO RESULT");
        } else {
            int counter = 0;
            for (int i : set) {
                counter++;
                if (counter == k) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
