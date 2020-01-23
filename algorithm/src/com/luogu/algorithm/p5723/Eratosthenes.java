package com.luogu.algorithm.p5723;

/**
 * 埃拉托斯特尼筛法（埃氏筛）——sieve of Eratosthenes
 * @author Eratosthenes
 */
public class Eratosthenes {
    public static void main(String[] args) {
        int num = 101;
        boolean[] array = new boolean[num];
        int k = 2, temp = 0;
        while(temp < num) {
            //将不是素数的数筛出
            for(int i = 2; i < num; i++) {
                if(i % k == 0 && i != k) {
                    array[i] = true;
                }
            }
            //将筛选后的第一个数当做新的筛子
            for(int i = 2; i < num; i++) {
                if(i > k && !array[i]) {
                    k=i;
                    break;
                }
            }
            temp++;
        }
        for(int i = 2; i < num; i++) {
            if(!array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
