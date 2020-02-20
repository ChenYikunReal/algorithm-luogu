package com.luogu.algorithm.p1086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static class Point {
        int x;
        int y;
        Integer value;
        Point(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        List<Point> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] first_line = reader.readLine().split("\\s+");
        int m = Integer.parseInt(first_line[0]);
        int n = Integer.parseInt(first_line[1]);
        int time = Integer.parseInt(first_line[2]);
        for (int i = 1; i <= m; i++) {
            String[] array = reader.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) {
                if (!"0".equals(array[j])) {
                    list.add(new Point(i, j+1, Integer.parseInt(array[j])));
                }
            }
        }
        reader.close();
        list.sort(Comparator.comparing(point -> -point.value));
        Point highest = list.remove(0);
        time -= 2*highest.x;
        time--;
        if (time < 0) {
            System.out.println(0);
            return;
        }
        int sum = highest.value;
        time += highest.x;
        int x = highest.x;
        int y = highest.y;
        for (Point point : list) {
            time -= (Math.abs(point.x-x));
            time -= (Math.abs(point.y-y));
            time--;
            time -= point.x;
            if (time < 0) {
                break;
            }
            sum += point.value;
            time += point.x;
            x = point.x;
            y = point.y;
        }
        System.out.println(sum);
    }

}
