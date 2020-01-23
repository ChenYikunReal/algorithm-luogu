package com.luogu.algorithm.p1022;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();
        //未知变量的表示（小写字母）
        char x = 'x';
        for (char c : expression.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                x = c;
                break;
            }
        }
        String[] expressionArr = expression.split("=");
        boolean leftNeg = false, rightNeg = false;
        String left = expressionArr[0], right = expressionArr[1];
        if (left.startsWith("-")) {
            leftNeg = true;
            left = left.substring(1, left.length());
        }
        if (right.startsWith("-")) {
            rightNeg = true;
            right = right.substring(1, right.length());
        }
        Queue<Character> leftCharacters = new LinkedList<>();
        if (leftNeg) {
            leftCharacters.offer('-');
        } else {
            leftCharacters.offer('+');
        }
        for(char c : left.toCharArray()) {
            if (c == '+' || c == '-') {
                leftCharacters.offer(c);
            }
        }
        Queue<Character> rightCharacters = new LinkedList<>();
        if (rightNeg) {
            rightCharacters.offer('-');
        } else {
            rightCharacters.offer('+');
        }
        for(char c : right.toCharArray()) {
            if (c == '+' || c == '-') {
                rightCharacters.offer(c);
            }
        }
        String[] leftArr = left.split("[+]|[-]"), rightArr = right.split("[+]|[-]");
        long leftCounter = 0, leftCoefficient = 0, rightCounter = 0, rightCoefficient = 0;
        outer:
        for (String leftObj : leftArr) {
            char[] chars = leftObj.toCharArray();
            char sign = leftCharacters.poll();
            for (char c : chars) {
                if (c == x) {
                    leftObj = leftObj.substring(0, leftObj.length()-1);
                    if ("".equals(leftObj)) {
                        leftCoefficient++;
                    } else {
                        leftCoefficient += Long.parseLong(sign+leftObj);
                    }
                    continue outer;
                }
            }
            //不是未知量
            leftCounter += Long.parseLong(sign+leftObj);
        }
        outer:
        for (String rightObj : rightArr) {
            char[] chars = rightObj.toCharArray();
            char sign = rightCharacters.poll();
            for (char c : chars) {
                if (c == x) {
                    rightObj = rightObj.substring(0, rightObj.length()-1);
                    if ("".equals(rightObj)) {
                        rightCoefficient++;
                    } else {
                        rightCoefficient += Long.parseLong(sign+rightObj);
                    }
                    continue outer;
                }
            }
            //不是未知量
            rightCounter += Long.parseLong(sign+rightObj);
        }
        double result = ((double)(rightCounter-leftCounter))/(leftCoefficient-rightCoefficient);
        if (result > -0.0005 && result < 0) {
            System.out.printf("%c=%.3f", x, 0.000);
        } else {
            System.out.printf("%c=%.3f", x, result);
        }
    }
}
