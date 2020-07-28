package com.luogu.algorithm.p1449;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        scanner.close();
        int tempNum = 0, x, y;
        for (char c : sequence.toCharArray()) {
            if (c == '@') {
                break;
            }
            switch (c) {
                case '+':
                    x = stack.pop();
                    y = stack.pop();
                    stack.push(y+x);
                    break;
                case '-':
                    x = stack.pop();
                    y = stack.pop();
                    stack.push(y-x);
                    break;
                case '*':
                    x = stack.pop();
                    y = stack.pop();
                    stack.push(y*x);
                    break;
                case '/':
                    x = stack.pop();
                    y = stack.pop();
                    stack.push(y/x);
                    break;
                case '.':
                    stack.push(tempNum);
                    tempNum = 0;
                    break;
                default:
                    tempNum = tempNum*10+c-'0';
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
