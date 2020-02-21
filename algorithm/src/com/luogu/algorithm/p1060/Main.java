package com.luogu.algorithm.p1060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = reader.readLine().split("\\s+");
        int n = Integer.parseInt(temp[0]), m = Integer.parseInt(temp[1]);
        int[] v = new int[m], w = new int[m], f = new int[n+1];
        for (int i = 0; i < m; i++) {
            temp = reader.readLine().split("\\s+");
            v[i] = Integer.parseInt(temp[0]);
            w[i] = Integer.parseInt(temp[1])*v[i];
        }
        reader.close();
        for (int i = 0; i < m; i++) {
            for (int j = n; j >= v[i]; j--) {
                f[j] = Math.max(f[j], f[j-v[i]]+w[i]);
            }
        }
        System.out.println(f[n]);
    }
}
