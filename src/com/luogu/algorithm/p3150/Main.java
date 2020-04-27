package com.luogu.algorithm.p3150;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if ((scanner.nextInt() & 1) == 0) {
                list.add("pb wins");
            } else {
                list.add("zs wins");
            }
        }
        scanner.close();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
