package com.luogu.algorithm.p1042;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean judgeEnding(int tempPointW, int tempPointL, int endCondition) {
        if ((tempPointW-tempPointL >= 2 && tempPointW >= endCondition) ||
                (tempPointL-tempPointW >= 2 && tempPointL >= endCondition)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> infoList = new LinkedList<>(), resultList = new LinkedList<>();
        boolean flag = false;
        while (!flag) {
            String line = scanner.nextLine();
            int index = line.indexOf("E");
            if (index != -1) {
                line = line.substring(0, index);
                flag = true;
            }
            infoList.add(line);
        }
//        if (infoList.size() == 1 && "".equals(infoList.get(0))) {
//            System.out.println("0:0\n\n0:0");
//        }
        int tempPointW = 0, tempPointL = 0;
        scanner.close();
        for (String s : infoList) {
            for (char c : s.toCharArray()) {
                if (c == 'W') {
                    tempPointW++;
                } else {        //'L'
                    tempPointL++;
                }
                //结束判断
                if (judgeEnding(tempPointW, tempPointL, 11)) {
                    resultList.add(tempPointW + ":" + tempPointL);
                    tempPointW = 0;
                    tempPointL = 0;
                }
            }
        }
        resultList.add(tempPointW + ":" + tempPointL);
        tempPointW = 0;
        tempPointL = 0;
        resultList.add("");
        for (String s : infoList) {
            for (char c : s.toCharArray()) {
                if (c == 'W') {
                    tempPointW++;
                } else {        //'L'
                    tempPointL++;
                }
                //结束判断
                if (judgeEnding(tempPointW, tempPointL, 21)) {
                    resultList.add(tempPointW + ":" + tempPointL);
                    tempPointW = 0;
                    tempPointL = 0;
                }
            }
        }
        resultList.add(tempPointW + ":" + tempPointL);
        for (String s : resultList) {
            System.out.println(s);
        }
    }

}
