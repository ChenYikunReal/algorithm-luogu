package com.luogu.algorithm.p5690;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("-");
        int n = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]), counter = 0;
        if (n > 12 || n == 0) {
            counter++;
        }
        if (m > 31 || m == 0 || n == 2 && m > 28) {
            counter++;
        }
        System.out.println(counter);
        scanner.close();
    }
}
