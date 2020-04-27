package com.luogu.algorithm.p2788;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();
        char[] chars = expression.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (char c : chars) {
            if (c == '+' || c == '-') {
                queue.offer(c);
            }
        }
        String[] numArray = expression.split("[+]|[-]");
        long result = Integer.parseInt(numArray[0]);
        for (int i = 1; i < numArray.length; i++) {
            long temp = Integer.parseInt(numArray[i]);
            if (queue.poll() == '+') {
                result += temp;
            } else {
                result -= temp;
            }
        }
        System.out.println(result);
    }
}
