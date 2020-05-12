package com.luogu.algorithm.p3156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * MLE
 * Java过不了这个题
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        String[] nums1 = reader.readLine().split(" ");
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        reader.close();
        while (tokenizer.hasMoreTokens()) {
            System.out.println(nums1[Integer.parseInt(tokenizer.nextToken())-1]);
        }
    }
}
