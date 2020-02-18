package com.luogu.algorithm.test.monty_holl_test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int times = 1000000;
        int winNum = 0;
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < times; i++) {
            set.add(0);
            set.add(1);
            set.add(2);
            //车在随机一个门后面
            int result = random.nextInt(3);
            //从三个门里面盲猜一个门
            int guessNum = random.nextInt(3);
            //剔除选项
            set.remove(guessNum);
            int removeNum = 3;
            while (removeNum == result || removeNum == guessNum) {
                removeNum = random.nextInt(3);
            }
            //主持人再删一个
            set.remove(removeNum);
            if (set.contains(result)) {
                winNum++;
            }
        }
        System.out.println("总游戏次数是：" + times);
        System.out.println("当更改选择的时候，获胜次数是：" + winNum);
        System.out.printf("更改选择的胜率是：%.3f%%", (double)winNum/times*100);
    }
}
