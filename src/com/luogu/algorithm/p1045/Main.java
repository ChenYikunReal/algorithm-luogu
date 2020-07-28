package com.luogu.algorithm.p1045;

import static java.math.BigInteger.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String p = reader.readLine();
        BigInteger num = new BigInteger("2").modPow(new BigInteger(p), new BigInteger("10").pow(500)).subtract(ONE);
        reader.close();
        int length = num.toString().length();
        StringBuilder result = new StringBuilder();
        if (length < 500) {
            for (int i = 0; i < 500-length; i++) {
                result.append('0');
            }
            result.append(num);
        } else {
            result.append(num);
        }
        String str = result.toString();
        result = new StringBuilder();
        result.append((int)(Math.log10(2)*Integer.parseInt(p))+1).append('\n');
        for (int i = 0; i < 10; i++) {
            result.append(str, i*50, i*50+50).append('\n');
        }
        System.out.println(result);
    }
}