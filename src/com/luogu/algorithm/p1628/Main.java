package com.luogu.algorithm.p1628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arrays = new String[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = sc.nextLine();
        }
        String pattern = sc.nextLine();
        sc.close();
        List<String> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (arrays[i].startsWith(pattern)) {
                list.add(arrays[i]);
            }
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

}
