package com.luogu.algorithm.p1567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = reader.read();
        reader.readLine();
        String[] arr = reader.readLine().split(" ");
        int counter = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            int tem1 = Integer.parseInt(arr[i]);
            int tem2 = Integer.parseInt(arr[i-1]);
            if((tem1 - tem2) > 0) {
                counter++;
            } else {
                max=Math.max(max, counter);
                counter = 0;
            }
        }
        System.out.println(max+1);
    }
}
