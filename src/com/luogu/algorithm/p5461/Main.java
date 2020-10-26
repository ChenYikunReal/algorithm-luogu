package com.luogu.algorithm.p5461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        n = (1<<n);
        int[][] arr = new int[n+2][n+2];
        StringBuilder builder;
        arr[0][n+1] = 1;
        for (int i = 1; i <= n; i++) {
            builder = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr[i-1][j] ^ arr[i-1][j+1];
                builder.append(arr[i][j]).append(' ');
            }
            System.out.println(builder.toString().trim());
        }
    }

}
