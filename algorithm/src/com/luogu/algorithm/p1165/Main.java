package com.luogu.algorithm.p1165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] f = new int[200001];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine()), tempNum, pointer = 0;
        String tempStr;
        for (int i = 0; i < num; ++i) {
            tempStr = reader.readLine();
            switch (tempStr.charAt(0)) {
                case '0':
                    f[++pointer] = Math.max(f[pointer-1], Integer.parseInt(tempStr.substring(2)));
                    break;
                case '1':
                    if (pointer > 0) {
                        --pointer;
                    }
                    break;
                default:
                    System.out.println(f[pointer]);
                    break;
            }
        }
        reader.close();
    }
}
