package com.luogu.algorithm.p1598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] char_counter = new int[26];
        int max = 0;
        //统计数据
        for (int i = 0; i < 4; i++) {
            for (char c : scanner.nextLine().toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    char_counter[c-'A']++;
                    int temp_counter = char_counter[c-'A'];
                    if (temp_counter > max) {
                        //置新最大数值
                        max = temp_counter;
                    }
                }
            }
        }
        scanner.close();
        //处理打印
        for (int i = max-1; i >= 0; i--) {
            StringBuilder builder = new StringBuilder();
            for (int j : char_counter) {
                if (j - i > 0) {
                    builder.append("* ");
                } else {
                    builder.append("  ");
                }
            }
            //去除尾部空格
            System.out.println(builder.substring(0, builder.length()-1));
        }
        System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }
}
