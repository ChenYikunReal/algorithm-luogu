package com.luogu.algorithm.p3741;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine()), counter = 0;
        String string = scanner.nextLine();
        scanner.close();
        while (string.contains("VK")) {
            string = string.replaceFirst("VK", "XX");
            counter++;
        }
        if (string.contains("VV") || string.contains("KK")) {
            counter++;
        }
        System.out.println(counter);
    }
}
