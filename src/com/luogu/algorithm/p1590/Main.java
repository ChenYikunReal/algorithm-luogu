package com.luogu.algorithm.p1590;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>(1000);
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            long limit = Long.parseLong(scanner.nextLine());
            long temp, result = 0, j = 1;
            while (limit != 0) {
                temp = limit % 10;
                if (temp >= 7) {
                    temp--;
                }
                result += (j * temp);
                limit /= 10;
                j *= 9;
            }
            list.add(result);
        }
        scanner.close();
        for (long i : list) {
            System.out.println(i);
        }
    }

}
