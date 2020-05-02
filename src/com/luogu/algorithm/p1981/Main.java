package com.luogu.algorithm.p1981;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<BigInteger> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        final BigInteger MOD_NUM = new BigInteger("10000");
        String expression = scanner.nextLine();
        scanner.close();
        if (!expression.contains("+") && !expression.contains("*")) {
            System.out.println(new BigInteger(expression).mod(MOD_NUM));
            return;
        }
        StringBuilder temp_num = new StringBuilder();
        for (char c : expression.toCharArray()) {
            if (c == '+') {
                if (stack.size() == 2) {
                    stack.push(stack.pop().add(stack.pop()));
                    stack.push(new BigInteger(temp_num.toString()));
                    temp_num = new StringBuilder();
                } else {
                    stack.push(new BigInteger(temp_num.toString()));
                    temp_num = new StringBuilder();
                }
            } else if (c == '*') {
                stack.push(stack.pop().multiply(new BigInteger(temp_num.toString())));
                temp_num = new StringBuilder();
            } else {
                temp_num.append(c);
            }
        }
        if (stack.size() == 2) {
            System.out.println(stack.pop().add(stack.pop()).add(new BigInteger(temp_num.toString())).mod(MOD_NUM));
        } else {
            System.out.println(stack.pop().add(new BigInteger(temp_num.toString())).mod(MOD_NUM));
        }
    }
}
