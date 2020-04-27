package com.luogu.algorithm.p5715;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        scanner.close();
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
