package com.luogu.algorithm.p2394;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader jin = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0, i = 0;
        List<Character> list = new ArrayList<>(16);
        char temp = (char)System.in.read();
        while((temp <= '9' && temp >= '0' || temp == '.') && counter < 20) {
            list.add(temp);
            temp = (char)System.in.read();
            counter++;
        }
        jin.close();
        char[] array = new char[list.size()];
        for (char c : list) {
            array[i] = c;
            i++;
        }
        BigDecimal number = new BigDecimal(array);
        number = number.divide(new BigDecimal("23"), 8, RoundingMode.HALF_UP);
        double result = number.doubleValue();
        System.out.printf("%.8f", result);
    }
}
