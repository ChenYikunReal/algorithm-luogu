package com.luogu.algorithm.p2670;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt(), row = scanner.nextInt();
        scanner.nextLine();
        char[][] graph = new char[column][row];
        for (int i = 0; i < column; i++) {
            char[] temp = scanner.nextLine().toCharArray();
            for (int j = 0; j < row; j++) {
                graph[i][j] = temp[j];
            }
        }
        scanner.close();
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                char temp = graph[i][j];
                if (temp == '*') {
                    continue;
                }
                char tempNum = '0';
                if (i - 1 >= 0) {
                    if (graph[i-1][j] == '*') {
                        tempNum++;
                    }
                    if (j - 1 >= 0 && graph[i-1][j-1] == '*') {
                        tempNum++;
                    }
                    if (j + 1 < row && graph[i-1][j+1] == '*') {
                        tempNum++;
                    }
                }
                if (i + 1 < column) {
                    if (graph[i+1][j] == '*') {
                        tempNum++;
                    }
                    if (j - 1 >= 0 && graph[i+1][j-1] == '*') {
                        tempNum++;
                    }
                    if (j + 1 < row && graph[i+1][j+1] == '*') {
                        tempNum++;
                    }
                }
                if (j - 1 >= 0 && graph[i][j-1] == '*') {
                    tempNum++;
                }
                if (j + 1 < row && graph[i][j+1] == '*') {
                    tempNum++;
                }
                graph[i][j] = tempNum;
            }
            for (int j = 0; j < row; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }
}
