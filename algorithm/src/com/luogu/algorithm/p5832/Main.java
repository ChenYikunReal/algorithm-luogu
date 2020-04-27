package com.luogu.algorithm.p5832;

import java.util.Scanner;

public class Main {

    private static char[] chars;

    private static int count(int i, int j, int num, int sum) {
        if(i < num && j < num && chars[i] == chars[j]) {
            return count(i+1,j+1, num, ++sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        chars = scanner.nextLine().toCharArray();
        scanner.close();
        int counter = 0;
        for(int i = 0; i < num; i++) {
            for(int j = i+1; j < num; j++) {
                int sum = count(i, j, num, 0);
                if(sum > counter) {
                    counter = sum;
                }
            }
        }
        System.out.println(counter+1);
    }

}
