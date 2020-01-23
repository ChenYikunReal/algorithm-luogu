package com.luogu.algorithm.p5741;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] name_array = new String[num];
        int[] chinese_array = new int[num];
        int[] math_array = new int[num];
        int[] english_array = new int[num];
        int[] grade_array = new int[num];
        for (int i = 0; i < num; i++) {
            String[] info = scanner.nextLine().split(" ");
            name_array[i] = info[0];
            chinese_array[i] = Integer.parseInt(info[1]);
            math_array[i] = Integer.parseInt(info[2]);
            english_array[i] = Integer.parseInt(info[3]);
            grade_array[i] = chinese_array[i] + math_array[i] + english_array[i];
        }
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                if (Math.abs(chinese_array[i]-chinese_array[j]) <= 5 &&
                        Math.abs(math_array[i]-math_array[j]) <= 5 &&
                        Math.abs(english_array[i]-english_array[j]) <= 5 &&
                        Math.abs(grade_array[i]-grade_array[j]) <= 10) {
                    System.out.println(name_array[i] + " " + name_array[j]);
                }
            }
        }
        scanner.close();
    }
}
