package com.luogu.algorithm.p1012;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] array = new String[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.next();
        }
        scanner.close();
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return (str1+str2).compareTo(str2+str1);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int i = num-1; i >= 0; i--) {
            builder.append(array[i]);
        }
        System.out.println(builder);
    }
}
