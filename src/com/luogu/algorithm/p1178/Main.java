package com.luogu.algorithm.p1178;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> time_set = new TreeSet<>();
        int[] month_list = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
        time_set.add(1);
        time_set.add(367);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            time_set.add(month_list[scanner.nextInt()]+scanner.nextInt());
        }
        scanner.close();
        if (num == 0) {
            System.out.println("86400");
            return;
        }
        Iterator<Integer> iterator = time_set.iterator();
        long prev = iterator.next(), max_time_slot = 0;
        while (iterator.hasNext()) {
            long temp = iterator.next();
            max_time_slot = Math.max(max_time_slot, temp-prev-1);
            prev = temp;
        }
        System.out.printf("%.0f", max_time_slot*24*3600/366.0);
    }
}
