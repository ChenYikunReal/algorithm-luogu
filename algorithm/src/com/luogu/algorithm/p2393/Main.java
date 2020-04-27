package com.luogu.algorithm.p2393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 样例6和样例8，这种写法过于精确了
 * 如果不用BigDecimal，那就精度不够精确
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal sum = new BigDecimal(0).setScale(5, RoundingMode.HALF_EVEN);;
        int firstRead = reader.read();
        if (firstRead == -1) {
            System.out.println("0.00000");
            return;
        }
        firstRead -= 48;
        String line = firstRead + reader.readLine();
        String[] array = line.trim().split("\\s+");
        reader.close();
        for (String s : array) {
            sum = sum.add(new BigDecimal(Double.parseDouble(s)));
        }
        System.out.printf("%.5f", sum);
    }
}
