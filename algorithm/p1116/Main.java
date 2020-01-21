package com.luogu.algorithm.p1116;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[num];
        for (int i = 0; i < num; i++) {
            arrInt[i] = scanner.nextInt();
        }
        System.out.println(bubbleSort(num, arrInt));
        scanner.close();
    }

    public static int bubbleSort(int length, int[] record) {
        int count = 0;
        int exchange = length - 1;
        int position, bound, temp;
        while (exchange != 0) {
            bound = exchange;
            exchange = 0;
            for (position = 0; position < bound; position++) {
                if (record[position] > record[position+1]) {
                    temp = record[position];
                    record[position] = record[position+1];
                    record[position+1] = temp;
                    exchange = position;
                    count++;
                }
            }
        }
        return count;
    }

}

