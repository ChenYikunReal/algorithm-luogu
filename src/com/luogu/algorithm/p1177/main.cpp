#include<iostream>

using namespace std;

int num, array[100001];

/**
 * 应用二分思想
 * @param left 左索引
 * @param right 右索引
 */
void quickSort(int left, int right) {
    int mid = array[(left+right)/2];//中间数
    int i = left, j = right;
    do {
        while (array[i] < mid) {
            i++;//查找左半部分比中间数大的数
        }
        while (array[j] > mid) {
            j--;//查找右半部分比中间数小的数
        }
        if (i <= j) {
            swap(array[i], array[j]);//交换
            i++;
            j--;
        }
    } while (i <= j);
    if (left < j) {
        quickSort(left, j);//递归搜索左半部分
    }
    if (i < right) {
        quickSort(i, right);//递归搜索右半部分
    }
}

int main() {
    cin >> num;
    for (int i = 1; i <= num; i++) {
        cin >> array[i];
    }
    quickSort(1, num);
    for (int i = 1; i <= num; i++) {
        cout << array[i] << " ";
    }
}
