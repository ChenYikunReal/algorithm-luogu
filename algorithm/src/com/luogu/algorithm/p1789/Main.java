package com.luogu.algorithm.p1789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //矩阵大小参数
        int matrixLen = scanner.nextInt();
        //火把数
        int torchNum = scanner.nextInt();
        //萤石数
        int candNum = scanner.nextInt();
        //创建矩阵
        boolean[][] matrix = new boolean[matrixLen][matrixLen];
        //填充火把可以照亮的位置
        for (int i = 0; i < torchNum; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            //左不越界
            if (x - 1 >= 0) {
                //左不越界+上不越界
                if (y - 1 >= 0) {
                    matrix[x-1][y-1] = true;
                }
                //左不越界+下不越界
                if (y + 1 < matrixLen) {
                    matrix[x-1][y+1] = true;
                }
            }
            //右不越界
            if (x + 1 < matrixLen) {
                //右不越界+上不越界
                if (y - 1 >= 0) {
                    matrix[x+1][y-1] = true;
                }
                //右不越界+下不越界
                if (y + 1 < matrixLen) {
                    matrix[x+1][y+1] = true;
                }
            }
            for (int j = 0; j <= 2; j++) {
                //左不越界
                if (x - j >= 0) {
                    matrix[x-j][y] = true;
                }
                //右不越界
                if (x + j < matrixLen) {
                    matrix[x+j][y] = true;
                }
                //上不越界
                if (y - j >= 0) {
                    matrix[x][y-j] = true;
                }
                //下不越界
                if (y + j < matrixLen) {
                    matrix[x][y+j] = true;
                }
            }
        }
        //填充萤石可以照亮的位置
        for (int i = 0; i < candNum; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            for (int j = 0; j <= 2; j++) {
                if (x - j >= 0) {
                    for (int k = 0; k <= 2; k++) {
                        if (y - k >= 0) {
                            matrix[x-j][y-k] = true;
                        }
                        if (y + k < matrixLen) {
                            matrix[x-j][y+k] = true;
                        }
                    }
                }
                if (x + j < matrixLen) {
                    for (int k = 0; k <= 2; k++) {
                        if (y - k >=0) {
                            matrix[x+j][y-k] = true;
                        }
                        if (y + k < matrixLen) {
                            matrix[x+j][y+k] = true;
                        }
                    }
                }
            }
        }
        //计算数量
        int count = 0;
        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                if (!matrix[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        //关闭输入流
        scanner.close();
    }
}
