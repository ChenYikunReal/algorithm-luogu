package com.luogu.algorithm.p1781;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Map<BigInteger, Integer> record = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 1; i <= num; i++) {
            record.put(new BigInteger(scanner.next()), i);
        }
        scanner.close();
        int counter = 0;
        for (Map.Entry entry : record.entrySet()) {
            if (counter == 1) {
                break;
            }
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
            counter++;
        }
    }
}
