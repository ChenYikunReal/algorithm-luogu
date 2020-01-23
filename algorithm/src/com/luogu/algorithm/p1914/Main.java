package com.luogu.algorithm.p1914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        char[] password_array = scanner.nextLine().toCharArray();
        for (int i = 0; i < password_array.length; i++) {
            password_array[i] = (char)((password_array[i] - 'a' + num) % 26 + 'a');
        }
        System.out.println(new String(password_array));
        scanner.close();
    }
}
