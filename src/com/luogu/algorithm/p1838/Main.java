package com.luogu.algorithm.p1838;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static boolean winJudge(Set<Integer> set) {
        if ((set.contains(1)) && ((set.contains(2) && set.contains(3)) || (set.contains(4) && set.contains(7)) ||
                (set.contains(5) && set.contains(9)))) {
            return true;
        }
        if ((set.contains(3)) && ((set.contains(6) && set.contains(9)) || (set.contains(5) && set.contains(7)))) {
            return true;
        }
        if (set.contains(2) && set.contains(5) && set.contains(8)) {
            return true;
        }
        if (set.contains(4) && set.contains(5) && set.contains(6)) {
            return true;
        }
        return set.contains(7) && set.contains(8) && set.contains(9);
    }

    public static void main(String[] args) {
        Set<Integer> xiaoa_set = new HashSet<>();
        Set<Integer> uim_set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        char[] sequence = scanner.nextLine().toCharArray();
        scanner.close();
        for (int i = 0; i < sequence.length; i++) {
            if ((i & 1) == 0) {
                xiaoa_set.add(sequence[i]-48);
                if (winJudge(xiaoa_set)) {
                    System.out.println("xiaoa wins.");
                    return;
                }
            } else {
                uim_set.add(sequence[i]-48);
                if (winJudge(uim_set)) {
                    System.out.println("uim wins.");
                    return;
                }
            }
        }
        System.out.println("drew.");
    }
}
