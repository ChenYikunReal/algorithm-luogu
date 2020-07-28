package com.luogu.algorithm.p1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //出发人数、站数、抵终人数、待求站号
        int a = scanner.nextInt(), n = scanner.nextInt(), m = scanner.nextInt(), x = scanner.nextInt();
        scanner.close();
        //先算a
        long first_up = a, next_up = 0, sum_a = a, sum_y_num = 0, y = 0, temp_up = 0, temp_down = 0, x_a = a, x_y = 0;
        for (int i = 3; i < n; i++) {
            temp_up = first_up + next_up;
            temp_down = next_up;
            first_up = next_up;
            next_up = temp_up;
            sum_a += (temp_up-temp_down);
        }
        //算y
        first_up = 0;
        next_up = 1;
        for (int i = 3; i < n; i++) {
            temp_up = first_up + next_up;
            temp_down = next_up;
            first_up = next_up;
            next_up = temp_up;
            sum_y_num += (temp_up-temp_down);
        }
        y = (m-sum_a)/sum_y_num;
        first_up = a;
        next_up = 0;
        for (int i = 3; i <= x; i++) {
            temp_up = first_up + next_up;
            temp_down = next_up;
            first_up = next_up;
            next_up = temp_up;
            x_a += (temp_up-temp_down);
        }
        first_up = 0;
        next_up = y;
        for (int i = 3; i <= x; i++) {
            temp_up = first_up + next_up;
            temp_down = next_up;
            first_up = next_up;
            next_up = temp_up;
            x_y += (temp_up-temp_down);
        }
        System.out.println(x_a+x_y);
    }
}
