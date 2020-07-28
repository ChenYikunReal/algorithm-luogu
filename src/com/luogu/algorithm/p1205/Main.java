package com.luogu.algorithm.p1205;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static char[][] chars1, chars2;

    private static int num;

    private static boolean judge1(char[][] chars1) {
        char[][] newChars = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                newChars[j][num-i-1] = chars1[i][j];
            }
        }
        return Arrays.deepEquals(newChars, chars2);
    }

    private static boolean judge2(char[][] chars1) {
        char[][] newChars = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                newChars[num-i-1][num-j-1] = chars1[i][j];
            }
        }
        return Arrays.deepEquals(newChars, chars2);
    }

    private static boolean judge3(char[][] chars1) {
        char[][] newChars = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                newChars[num-j-1][i] = chars1[i][j];
            }
        }
        return Arrays.deepEquals(newChars, chars2);
    }

    private static char[][] generateJudge4Arr() {
        char[][] newChars = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                newChars[i][num-j-1] = chars1[i][j];
            }
        }
        return newChars;
    }

    private static boolean judge4() {
        char[][] newChars = generateJudge4Arr();
        return Arrays.deepEquals(newChars, chars2);
    }

    private static boolean judge5() {
        char[][] newChars = generateJudge4Arr();
        return judge1(newChars) || judge2(newChars) || judge3(newChars);
    }

    private static boolean judge6() {
        return Arrays.deepEquals(chars1, chars2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = Integer.parseInt(scanner.nextLine());
        chars1 = new char[num][num];
        chars2 = new char[num][num];
        for (int i = 0; i < num; i++) {
            char[] tempChars = scanner.nextLine().toCharArray();
            System.arraycopy(tempChars, 0, chars1[i], 0, num);
        }
        for (int i = 0; i < num; i++) {
            char[] tempChars = scanner.nextLine().toCharArray();
            System.arraycopy(tempChars, 0, chars2[i], 0, num);
        }
        scanner.close();
        if (judge1(chars1)) {
            System.out.println(1);
        } else if (judge2(chars1)) {
            System.out.println(2);
        } else if (judge3(chars1)) {
            System.out.println(3);
        } else if (judge4()) {
            System.out.println(4);
        } else if (judge5()) {
            System.out.println(5);
        } else if (judge6()) {
            System.out.println(6);
        } else {
            System.out.println(7);
        }
    }

}
