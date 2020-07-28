package com.luogu.algorithm.p1413;

import java.util.*;

public class Main {

    private static int counter = 0;

    private static void iterator(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        if (iterator.hasNext()) {
            int prev = iterator.next();
            counter++;
            while (iterator.hasNext()) {
                int temp = iterator.next();
                if (temp - prev >= 60) {
                    prev = temp;
                    counter++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> zombies1 = new TreeSet<>(), zombies2 = new TreeSet<>(), zombies3 = new TreeSet<>(),
                zombies4 = new TreeSet<>(), zombies5 = new TreeSet<>(), zombies6 = new TreeSet<>();
        Map<Integer, Set<Integer>> zombie_map = new HashMap<>();
        zombie_map.put(1, zombies1);
        zombie_map.put(2, zombies2);
        zombie_map.put(3, zombies3);
        zombie_map.put(4, zombies4);
        zombie_map.put(5, zombies5);
        zombie_map.put(6, zombies6);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            zombie_map.get(scanner.nextInt()).add(scanner.nextInt());
        }
        scanner.close();
        for (int i = 1; i <= 6; i++) {
            iterator(zombie_map.get(i));
        }
        System.out.println(counter);
    }

}
