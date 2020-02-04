package com.luogu.algorithm.p1897;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            set.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(Collections.max(set)*10 + set.size()*5 + num);
    }
}
