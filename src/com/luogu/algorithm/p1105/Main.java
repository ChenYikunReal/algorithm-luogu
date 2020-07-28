package com.luogu.algorithm.p1105;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static class Platform {
        int id;
        int height;
        int left;
        int right;
        Platform(int id, int height, int left, int right) {
            this.id = id;
            this.height = height;
            this.left = left;
            this.right = right;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Platform platform = (Platform) o;
            return id == platform.id;
        }
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Platform[] platforms = new Platform[num];
        for (int i = 0; i < num; i++) {
            platforms[i] = new Platform(i, scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        scanner.close();
        Platform[] sortedPlatforms = Arrays.copyOf(platforms, num);
        Arrays.sort(sortedPlatforms, Comparator.comparing(e->-e.height));
        for (Platform platform : platforms) {
            StringBuilder result = new StringBuilder();
            boolean flag = false;
            int i = 0;
            for (; i < num; i++) {
                Platform temp = sortedPlatforms[i];
                if (temp.equals(platform)) {
                    i++;
                    break;
                }
            }
            for (; i < num; i++) {
                Platform temp = sortedPlatforms[i];
                if (platform.left > temp.left && platform.left < temp.right) {
                    result.append(temp.id+1).append(' ');
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.append(0).append(' ');
            }
            flag = false;
            i = 0;
            for (; i < num; i++) {
                Platform temp = sortedPlatforms[i];
                if (temp.equals(platform)) {
                    i++;
                    break;
                }
            }
            for (; i < num; i++) {
                Platform temp = sortedPlatforms[i];
                if (platform.right > temp.left && platform.right < temp.right) {
                    result.append(temp.id+1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.append(0);
            }
            System.out.println(result);
        }
    }

}
