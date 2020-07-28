package com.luogu.algorithm.p3392;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = reader.readLine().split("\\s+");
        int n = Integer.parseInt(line1[0]), m = Integer.parseInt(line1[1]);
        char[][] graph = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] read_temp = reader.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                graph[i][j] = read_temp[j];
            }
        }
        reader.close();
        int min_result = 0x7fffffff, temp_result = 0;
        //确定白行数
        for (int i = 0; i < n-2; i++) {
            //确定蓝行数
            for (int j = i+1; j < n-1; j++) {
                //循环白
                for (int k = 0; k <= i; k++) {
                   for (int p = 0; p < m; p++) {
                     if (graph[k][p] != 'W') {
                          temp_result++;
                        }
                    }
                }
                //循环蓝
                for (int k = i+1; k <= j; k++) {
                    for (int p = 0; p < m; p++) {
                        if (graph[k][p] != 'B') {
                            temp_result++;
                        }
                    }
                }
                //循环红
                for (int k = j+1; k < n; k++) {
                    for (int p = 0; p < m; p++) {
                        if (graph[k][p] != 'R') {
                            temp_result++;
                        }
                    }
                }
                if (temp_result < min_result) {
                    min_result = temp_result;
                }
                temp_result = 0;
            }
        }
        System.out.println(min_result);
    }
}
