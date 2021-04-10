#include <iostream>

using namespace std;

string in_order, pre_order;

/**
 * 前序遍历第一个是根，在后序中找到根的位置，分别递归左右子树，直到只有一个元素或者零个元素为止
 * @param a 前序左边界
 * @param b 前序右边界
 * @param p 中序左边界
 * @param q 中序右边界
 */
void post_order(int a, int b, int p, int q) {
    if (a > b || p > q) {
        return;
    }
    // 在后序中找到根的位置
    int index = in_order.find(pre_order[a]);
    // 递归左子树
    post_order(a+1, a+index-p, p, index-1);
    // 递归右子树
    post_order(a+index-p+1, b, index+1, q);
    cout << pre_order[a];
}

int main() {
    cin >> in_order >> pre_order;
    int len = in_order.length() - 1;
    post_order(0, len, 0, len);
    return 0;
}
