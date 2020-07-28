package com.luogu.algorithm.p3654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int result = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = reader.readLine().split("\\s+");
        int n = Integer.parseInt(line1[0]), m = Integer.parseInt(line1[1]), k = Integer.parseInt(line1[2]);
        char[][] graph = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] read_temp = reader.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                graph[i][j] = read_temp[j];
            }
        }
        reader.close();
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (graph[i][j] == '.') {
                        result++;
                    }
                }
            }
            System.out.println(result);
            return;
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int p = 0; p < k; p++) {
                    if (i+p >= n) {
                        flag = true;
                        break;
                    } else if (graph[i+p][j] != '.') {
                        flag = true;
                    }
                }
                if (flag) {
                    flag = false;
                } else {
                    result++;
                }
                for (int p = 0; p < k; p++) {
                    if (j+p >= m) {
                        flag = true;
                        break;
                    } else if (graph[i][j+p] != '.') {
                        flag = true;
                    }
                }
                if (flag) {
                    flag = false;
                } else {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
