package com.luogu.algorithm.p6194;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 8;
        char[] input;
        char[][] matrix = new char[n][n];
        byte[][] result = new byte[n][n];
        for (int i = 0; i < n; i++) {
            input = reader.readLine().trim().toCharArray();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input[j];
                result[i][j] = 1;
            }
        }
        reader.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 'R') {
                    result[i][j] = 0;
                    for (int k = i-1; k >= 0 && matrix[k][j] != 'R' && matrix[k][j] != 'B'; k--) {
                        result[k][j] = 0;
                    }
                    for (int k = i+1; k < n && matrix[k][j] != 'R' && matrix[k][j] != 'B'; k++) {
                        result[k][j] = 0;
                    }
                    for (int k = j-1; k >= 0 && matrix[i][k] != 'R' && matrix[i][k] != 'B'; k--) {
                        result[i][k] = 0;
                    }
                    for (int k = j+1; k < n && matrix[i][k] != 'R' && matrix[i][k] != 'B'; k++) {
                        result[i][k] = 0;
                    }
                } else if (matrix[i][j] == 'B') {
                    result[i][j] = 0;
                    for (int k = 1; i-k >= 0 && j-k >= 0 && matrix[i-k][j-k] != 'R' && matrix[i-k][j-k] != 'B'; k++) {
                        result[i-k][j-k] = 0;
                    }
                    for (int k = 1; i-k >= 0 && j+k < n && matrix[i-k][j+k] != 'R' && matrix[i-k][j+k] != 'B'; k++) {
                        result[i-k][j+k] = 0;
                    }
                    for (int k = 1; i+k < n && j-k >= 0 && matrix[i+k][j-k] != 'R' && matrix[i+k][j-k] != 'B'; k++) {
                        result[i+k][j-k] = 0;
                    }
                    for (int k = 1; i+k < n && j+k < n && matrix[i+k][j+k] != 'R' && matrix[i+k][j+k] != 'B'; k++) {
                        result[i+k][j+k] = 0;
                    }
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                builder.append(result[i][j]);
            }
            builder.append('\n');
        }
        System.out.print(builder);
    }

}
