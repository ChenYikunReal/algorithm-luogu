package com.luogu.algorithm.p5886;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] start = reader.readLine().split(" ");
        int n = Integer.parseInt(start[0]), m = Integer.parseInt(start[1]), p = Integer.parseInt(start[2]);
        int[] array = new int[m+1];
        for (int i = 0; i < n; i++) {
            String[] temp = reader.readLine().split(" ");
            int num = Integer.parseInt(temp[0]);
            for (int j = 0; j < num; j++) {
                array[Integer.parseInt(temp[j+1])]++;
            }
        }
        reader.close();
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (int i = 1; i <= m; i++) {
            if (array[i] == p) {
                result.append(i).append(" ");
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(result.toString().trim());
    }
}
