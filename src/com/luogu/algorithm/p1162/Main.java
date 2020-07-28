package com.luogu.algorithm.p1162;

import java.util.Scanner;

public class Main {

    private static int num;

    private static byte[][] array;

    private static void bfs(int x, int y) {
        if (array[x][y] == 1) {
            return;
        } else {
            array[x][y] = 0;
        }
        if (x > 0 && array[x-1][y] == 2) {
            bfs(x-1, y);
        }
        if (x < num-1 && array[x+1][y] == 2) {
            bfs(x+1, y);
        }
        if (y > 0 && array[x][y-1] == 2) {
            bfs(x, y-1);
        }
        if (y < num-1 && array[x][y+1] == 2) {
            bfs(x, y+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = Integer.parseInt(scanner.nextLine());
        array = new byte[num][num];
        for (int i = 0; i < num; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < num; j++) {
                if ("0".equals(line[j])) {
                    array[i][j] = 2;
                } else {
                    array[i][j] = Byte.parseByte(line[j]);
                }
            }
        }
        scanner.close();
        for (int i = 0; i < num; i++) {
            bfs(i, 0);
            bfs(i, num-1);
            bfs(0, i);
            bfs(num-1, i);
        }
        for (int i = 0; i < num; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < num; j++) {
                builder.append(array[i][j]).append(' ');
            }
            System.out.println(builder.toString().trim());
        }
    }

}
