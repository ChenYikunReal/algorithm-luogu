package com.luogu.algorithm.p1059;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println(set.size());
        StringBuilder builder = new StringBuilder();
        for (int i : set) {
            builder.append(i + " ");
        }
        System.out.println(builder.toString().trim());
        scanner.close();
    }
}
