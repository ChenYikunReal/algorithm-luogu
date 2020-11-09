package com.luogu.algorithm.p6206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Java太慢 过不了这个题
public class Main {

    public static void main(String[] args) throws IOException {
        long counter = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        while (n != 1) {
            if ((n & 1) == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            counter++;
        }
        System.out.println(counter);
    }

}
