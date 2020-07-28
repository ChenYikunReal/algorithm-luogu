package com.luogu.algorithm.p5143;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static class Hill {
        int x;
        int y;
        int z;
        Hill(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        Set<Hill> set = new TreeSet<>(Comparator.comparing(e -> e.z));
        for (int i = 0; i < num; i++) {
            String[] temp = reader.readLine().split("\\s+");
            set.add(new Hill(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2])));
        }
        reader.close();
        Iterator<Hill> iterator = set.iterator();
        Hill hill0 = iterator.next();
        int x = hill0.x, y = hill0.y, z = hill0.z;
        double sum = 0;
        while (iterator.hasNext()) {
            Hill hill = iterator.next();
            sum += Math.sqrt((hill.x-x)*(hill.x-x) + (hill.y-y)*(hill.y-y) + (hill.z-z)*(hill.z-z));
            x = hill.x;
            y = hill.y;
            z = hill.z;
        }
        System.out.printf("%.3f", sum);
    }

}
