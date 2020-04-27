package com.luogu.algorithm.p5082;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Note
 * 该程序跑不过前四个样例的，因为被严重卡性能了，所以请用cpp，食用起来，口感更佳……
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        double sum = 0, getSum = 0;
        String[] array = reader.readLine().split("\\s+");
        for (int i = 0; i < num; i++) {
            sum += Integer.parseInt(array[i]);
        }
        System.gc();
        array = reader.readLine().split("\\s+");
        reader.close();
        for (int i = 0; i < num; i++) {
            getSum += Integer.parseInt(array[i]);
        }
        System.out.printf("%.6f", (sum*3-getSum*2)/(sum-getSum));
    }
}
