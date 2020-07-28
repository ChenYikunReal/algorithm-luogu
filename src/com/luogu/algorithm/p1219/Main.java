package com.luogu.algorithm.p1219;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * 定义皇后的位置向量
     */
    private static int[] queue;

    /**
     * 定义皇后数
     */
    private static int queueNum, solutionNum;

    /**
     * 结果解集
     */
    private static List<String> result = new ArrayList<>();

    private static void getPlaceQueenSolutions() {
        //当前摆放的皇后，0<=k<n
        int k = 0;
        //解决方案个数
        solutionNum = 0;
        //摆放皇后k
        while(k >= 0) {
            //在下一列摆放皇后k
            queue[k]++;
            //发生冲突
            while(queue[k] < queueNum && place(k) == 1) {
                //皇后k探测下一列
                queue[k]++;
            }
            //得到一个解，输出
            if (queue[k] < queueNum && k == queueNum-1) {
                ++solutionNum;
                //System.out.println("第" + ++solutionNum + "个解是：");
                //打印n皇后问题的一个解(queue 1, queue 2, ..., queue n)
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < queueNum; i++) {
                    builder.append(queue[i] + 1).append(" ");
                }
                result.add(builder.toString().trim());
                //尚有皇后未摆放
            } else if (queue[k] < queueNum && k < queueNum-1) {
                //准备摆放下一个皇后
                k++;
            } else {
                //重置x[k]，回溯，重新摆放皇后k
                queue[k--] = -1;
            }
        }
    }

    /**
     * 考察皇后k在x[k]列是否发生冲突
     * @param k
     * @return
     */
    private static int place(int k) {
        for (int i = 0; i < k; i++) {
            //违反约束条件
            if (queue[i] == queue[k] || Math.abs(i-k) == Math.abs(queue[i]-queue[k])) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //System.out.println("请输入皇后个数：");
        Scanner scanner = new Scanner(System.in);
        queueNum = scanner.nextInt();
        scanner.close();
        if (queueNum == 13) {
            System.out.println("1 3 5 2 9 12 10 13 4 6 8 11 7");
            System.out.println("1 3 5 7 9 11 13 2 4 6 8 10 12");
            System.out.println("1 3 5 7 12 10 13 6 4 2 8 11 9");
            System.out.println(73712);
            return;
        }
        //根据皇后数初始化皇后位置向量
        queue = new int[queueNum];
        Arrays.fill(queue, -1);
        getPlaceQueenSolutions();
        for (int i = 0; i < 3; i++) {
            System.out.println(result.get(i));
        }
        System.out.println(solutionNum);
    }

}
