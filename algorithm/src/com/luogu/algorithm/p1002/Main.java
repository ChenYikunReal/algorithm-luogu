package com.luogu.algorithm.p1002;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[][] chessBoard = new long[50][50];
        short y2 = scanner.nextShort(), x2 = scanner.nextShort(), y1 = scanner.nextShort(), x1 = scanner.nextShort();
        //隔出两格，当要把马可跳到的地方掷成0时不会出错
        y2 += 2;
        x2 += 2;
        y1 += 2;
        x1 += 2;
        for(int i = 2; i <= x2; i++) {
            for(int j = 2; j <= y2; j++) {
                //将这个数左边和上面的数相加
                chessBoard[i][j] = chessBoard[i-1][j] + chessBoard[i][j-1];
                //由于会把起点掷成0，所以要回归1
                chessBoard[2][2] = 1;
                //将马的地方掷成0
                chessBoard[x1][y1] = 0;
                //将马可跳到的地方掷成0
                chessBoard[x1+2][y1+1] = 0;
                chessBoard[x1+2][y1-1] = 0;
                //将马可跳到的地方掷成0
                chessBoard[x1-2][y1+1] = 0;
                chessBoard[x1-2][y1-1] = 0;
                //将马可跳到的地方掷成0
                chessBoard[x1+1][y1+2] = 0;
                chessBoard[x1+1][y1-2] = 0;
                //将马可跳到的地方掷成0
                chessBoard[x1-1][y1+2] = 0;
                chessBoard[x1-1][y1-2] = 0;
            }
        }
        System.out.println(chessBoard[x2][y2]);
        scanner.close();
    }
}

