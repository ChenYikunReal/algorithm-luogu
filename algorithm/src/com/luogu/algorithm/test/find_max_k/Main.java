package com.luogu.algorithm.test.find_max_k;

import java.util.Scanner;

public class Main {
    /**
     * 寻找第k大的元素
     * @param array  待调整的堆
     * @param k  第几大
     */
    public static int findNumberK(int[] array, int k){
        //用前k个元素构建小顶堆
        buildHeap(array, k);
        //继续遍历数组，和堆顶比较
        for (int i=k; i<array.length;i++){
            if (array[i] > array[0]){
                array[0] = array[i];
                downAdjust(array, 0, k);
            }
        }
        //返回堆顶元素
        return array[0];
    }

    /**
     * 构建堆
     * @param array  待调整的堆
     * @param length  堆的有效大小
     */
    private static void buildHeap(int[] array, int length) {
        //从最后一个非叶子节点开始，依次下沉调整
        for (int i = (length- 2)/ 2; i >= 0; i--) {
            downAdjust(array, i, length);
        }
    }

    /**
     * 下沉调整
     * @param array     待调整的堆
     * @param index    要下沉的节点
     * @param length    堆的有效大小
     */
    private static void downAdjust(int[] array, int index, int length) {
        //temp保存父节点值，用于最后的赋值
        int temp = array[index];
        int childIndex = 2 * index + 1;
        while (childIndex < length) {
            //如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            //如果父节点小于任何一个孩子的值，直接跳出
            if (temp <= array[childIndex])
                break;
            //无需真正交换，单向赋值即可
            array[index] = array[childIndex];
            index = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[index] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), k = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        //int[] array = new int[] {7, 5, 15, 3, 17, 2, 20, 24, 1, 9, 12, 8};
        System.out.println(findNumberK(array, k));
    }

}
