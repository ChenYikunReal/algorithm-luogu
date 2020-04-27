package com.luogu.algorithm.p2356;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[][] graph;

    private static int num;

    private static int count(int x_position, int y_position) {
        int counter = 0;
        for (int i = 0; i < num; i++) {
            counter += graph[i][y_position];
            counter += graph[x_position][i];
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());
        graph = new int[num][num];
        int[] blank_x_array = new int[10000];
        int[] blank_y_array = new int[10000];
        int counter = 0;
        for (int i = 0; i < num; i++) {
            String[] tempArr = reader.readLine().split(" ");
            for (int j = 0; j < num; j++) {
                int temp = Integer.parseInt(tempArr[j]);
                if (temp == 0) {
                    blank_x_array[counter] = i;
                    blank_y_array[counter] = j;
                    counter++;
                }
                graph[i][j] = temp;
            }
        }
        reader.close();
        if (counter == 0) {
            System.out.println("Bad Game!");
        } else {
            int max = 0;
            for (int i = 0; i < counter; i++) {
                int temp = count(blank_x_array[i], blank_y_array[i]);
                if (temp > max) {
                    max = temp;
                }
            }
            System.out.println(max);
        }
    }

}
