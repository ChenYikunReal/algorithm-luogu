package com.luogu.algorithm.p5728;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] chinese_array = new int[num], math_array = new int[num],
                english_array = new int[num], grade_array = new int[num];
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            chinese_array[i] = Integer.parseInt(arr[0]);
            math_array[i] = Integer.parseInt(arr[1]);
            english_array[i] = Integer.parseInt(arr[2]);
            grade_array[i] = chinese_array[i] + math_array[i] + english_array[i];
        }
        int counter = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                if (Math.abs(chinese_array[i]-chinese_array[j]) <= 5 &&
                        Math.abs(math_array[i]-math_array[j]) <= 5 &&
                        Math.abs(english_array[i]-english_array[j]) <= 5 &&
                        Math.abs(grade_array[i]-grade_array[j]) <= 10) {
                    counter++;
                }
            }
        }
        scanner.close();
        System.out.println(counter);
    }
}
