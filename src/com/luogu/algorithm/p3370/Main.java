package com.luogu.algorithm.p3370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(bf.readLine());
        }
        bf.close();
        System.out.println(set.size());
    }

}
