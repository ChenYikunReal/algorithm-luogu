#include <stdio.h>

/**
 * 递归的算数函数
 * @param i
 * @param j
 * @return
 */
int getNum(int i, int j) {
    if(i == j || j == 0) {
        return 1;
    } else {
        return (getNum(i-1, j-1) + getNum(i-1, j));
    }
}

/**
 * 打印函数
 * @param row
 */
void print(int row) {
    int i, j, k;
    for(i = 0; i < row; i++) {
        for(j = 0; j <= i; j++) {
            if(j == 0) {
                for(k = 0; k < row-i; k++) {
                    printf("   ");
                }
            } else {
                printf("   ");
            }
            printf("%3d", getNum(i, j));
        }
        printf("\n");
    }
}

int main() {
    int num;
    scanf("%d", &num);
    print(num);
    return 0;
}
