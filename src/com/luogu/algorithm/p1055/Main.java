package com.luogu.algorithm.p1055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        String[] code_array = code.split("-");
        int count = 1, sum = 0;
        for (int i = 0; i < 3; i++) {
            for (char c : code_array[i].toCharArray()) {
                sum += (count * (c - '0'));
                count++;
            }
        }
        int mod = sum % 11;
        if (Integer.toString(mod).equals(code_array[3])) {
            System.out.println("Right");
        } else if (mod == 10) {
            if (code_array[3].equals("X")) {
                System.out.println("Right");
            } else {
                System.out.println(code.substring(0, 12) + "X");
            }
        } else {
            System.out.println(code.substring(0, 12) + mod);
        }
        scanner.close();
    }
}
