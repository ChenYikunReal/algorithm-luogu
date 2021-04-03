package com.luogu.algorithm.p1324;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1, m = sc.nextInt()-1;
        long result = 0;
        // 必须用这个
        Integer[] row = new Integer[n], line = new Integer[m];
        for (int i = 0; i < n; i++) {
            row[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            line[j] = sc.nextInt();
        }
        // 升序改降序
        Arrays.sort(row, Comparator.reverseOrder());
        Arrays.sort(line, Comparator.reverseOrder());
        long i_count = 1, j_count = 1;
        for (int i = 0, j = 0; i < n || j < m; ) {
            if (i == n) {
                result += i_count*line[j];
                j_count++;
                j++;
            } else if (j == m || row[i] > line[j]) {
                result += j_count*row[i];
                i_count++;
                i++;
            } else {
                result += i_count*line[j];
                j_count++;
                j++;
            }
        }
        System.out.println(result);
        sc.close();
    }

}
