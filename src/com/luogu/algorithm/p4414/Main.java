package com.luogu.algorithm.p4414;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(array);
        char[] chars = scanner.next().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            switch (c) {
                case 'A':
                    builder.append(array[0]).append(" ");
                    break;
                case 'B':
                    builder.append(array[1]).append(" ");
                    break;
                default:
                    builder.append(array[2]).append(" ");
                    break;

            }
        }
        scanner.close();
        System.out.println(builder.toString().trim());
    }
}
