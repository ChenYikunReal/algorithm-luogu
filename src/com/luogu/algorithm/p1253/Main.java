package com.luogu.algorithm.p1253;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static class Record {
        int value;
        int id;
        Record(int id, int value) {
            this.value = value;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Record[] records = new Record[num];
        for (int i = 0; i < num; i++) {
            records[i] = new Record(i+1, scanner.nextInt()*scanner.nextInt());
        }
        scanner.close();
        Arrays.sort(records, Comparator.comparing(e -> -e.value));
        StringBuilder result = new StringBuilder();
        for (Record record : records) {
            result.append(record.id).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
