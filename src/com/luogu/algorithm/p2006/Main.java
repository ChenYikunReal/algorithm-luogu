package com.luogu.algorithm.p2006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt(), num = scanner.nextInt(), min = scanner.nextInt();
        long consume, damage;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            consume = scanner.nextLong();
            damage = scanner.nextLong();
            if ((consume == 0 && damage > 0) || (consume > 0 && consume <= max && damage*(max/consume) >= min)) {
                builder.append(i).append(" ");
            }
        }
        scanner.close();
        if (builder.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(builder.toString().trim());
        }
    }
}
