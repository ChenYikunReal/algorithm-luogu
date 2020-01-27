package com.luogu.algorithm.p1143;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int origin_radix = Integer.parseInt(scanner.nextLine());
        String num = scanner.nextLine();
        int now_radix = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(Integer.toString(Integer.parseInt(num, origin_radix), now_radix).toUpperCase());
    }
}
