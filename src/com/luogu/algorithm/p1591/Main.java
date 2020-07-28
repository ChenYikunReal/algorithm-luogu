package com.luogu.algorithm.p1591;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger[] nums = new BigInteger[1001];
        nums[0] = nums[1] = BigInteger.ONE;
        for (int i = 2; i <= 1000; i++) {
            nums[i] = nums[i-1].multiply(new BigInteger(Integer.toString(i)));
        }
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt(), a = scanner.nextInt();
            int counter = 0;
            for (char c : nums[n].toString().toCharArray()) {
                if (c == (char)('0'+a)) {
                    counter++;
                }
            }
            builder.append(counter).append('\n');
        }
        scanner.close();
        System.out.print(builder);
    }
}
