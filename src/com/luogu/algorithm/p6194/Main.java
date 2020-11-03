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
        for (int i = 0; i < n; i++) {
            input = reader.readLine().trim().toCharArray();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input[j];
            }
        }
        reader.close();

    }

}
