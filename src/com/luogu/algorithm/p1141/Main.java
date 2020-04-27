package com.luogu.algorithm.p1141;

import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TLE样例2 且 WA样例9、10
 */
public class Main {

    private static boolean[][] visited_graph, zero_one_graph;

    private static int n;

    private static int bfs(int tempNum, int x, int y) {
        tempNum++;
        visited_graph[x][y] = true;
        if (x != 0 && !visited_graph[x-1][y] && zero_one_graph[x][y] != zero_one_graph[x-1][y]) {
            tempNum = bfs(tempNum, x-1, y);
        }
        if (x != n-1 && !visited_graph[x+1][y] && zero_one_graph[x][y] != zero_one_graph[x+1][y]) {
            tempNum = bfs(tempNum, x+1, y);
        }
        if (y != 0 && !visited_graph[x][y-1] && zero_one_graph[x][y] != zero_one_graph[x][y-1]) {
            tempNum = bfs(tempNum, x, y-1);
        }
        if (y != n-1 && !visited_graph[x][y+1] && zero_one_graph[x][y] != zero_one_graph[x][y+1]) {
            tempNum = bfs(tempNum, x, y+1);
        }
        return tempNum;
    }

    public static void main(String[] args) throws IOException {
        //new InputStreamReader(System.in)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader(new File(
//                "D:/IDEA/algorithm/src/com/luogu/algorithm/p1141/P1141_2.in")));
        String[] tempArr = reader.readLine().split("\\s+");
        n = Integer.parseInt(tempArr[0]);
        int m = Integer.parseInt(tempArr[1]);
        visited_graph = new boolean[n][n];
        zero_one_graph = new boolean[n][n];
        int[][] counter = new int[n][n];
        char[] tempCharArr;
        for (int i = 0; i < n; i++) {
            tempCharArr = reader.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                if (tempCharArr[j] == '1') {
                    zero_one_graph[i][j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            tempArr = reader.readLine().split("\\s+");
            int x= Integer.parseInt(tempArr[0])-1, y = Integer.parseInt(tempArr[1])-1;
            if (counter[x][y] != 0) {
                System.out.println(counter[x][y]);
            } else {
                int result = bfs(0, x, y);
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (visited_graph[j][k]) {
                            counter[j][k] = result;
                            visited_graph[j][k] = false;
                        }
                    }
                }
                System.out.println(result);
            }
        }
        reader.close();
    }
}
