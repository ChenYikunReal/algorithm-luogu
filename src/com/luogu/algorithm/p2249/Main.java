package com.luogu.algorithm.p2249;

import java.io.*;
import java.util.*;

// TLE+MLE
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split("\\s+");
        int n = Integer.parseInt(line[0]), m = Integer.parseInt(line[1]);
        List<Integer> list = new ArrayList<>(n);
        line = bf.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(line[i]));
        }
        line = bf.readLine().split("\\s+");
        for (int i = 0; i < m; i++) {
            System.out.print(list.indexOf(Integer.parseInt(line[i])) + " ");
        }
        bf.close();
    }

}
