package com.luogu.algorithm.test;

public class BinarySearchTest {

    private static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while(low <= high) {
            int mid = low + (high - low >>> 1);
            int midValue = array[mid];
            if (midValue < key) {
                low = mid + 1;
            } else {
                if (midValue <= key) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 4, 5, 6, 13, 16, 19, 3333, 44444, 68679};
        System.out.println(binarySearch(array, 0, array.length, 15));
        System.out.println(binarySearch(array, 1, array.length, 16));
    }
}
