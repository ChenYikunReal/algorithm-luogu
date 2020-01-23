package com.luogu.algorithm.p5740;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String result = "";
        int max = -1;
        for (int i = 0; i < num; i++) {
            String info = scanner.nextLine();
            String[] arr = info.split(" ");
            int grade = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
            if (grade > max) {
                max = grade;
                result = info;
            }
        }
        scanner.close();
        System.out.println(result);
    }
}
