#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int n, prev = 0, temp, result, i = 0, j;
    string necklace;
    cin >> n >> necklace;
    // 复制一份
    necklace += necklace;
    char prev_c, temp_c;
    // 合并最初的w
    while ((necklace[i] == 'w') && i < n) {
        prev++;
        i++;
    }
    // 初始化找出第一个prev 包含当前或w
    prev_c = necklace[i];
    // 限制防止跑两遍
    while ((necklace[i] == prev_c || necklace[i] == 'w') && i < n) {
        prev++;
        i++;
    }
    result = prev;
    // 否则会双倍
    if (i < n) {
        // 正式开始遍历
        for (; i < 2*n;) {
            temp = 0;
            temp_c = necklace[i];
            // 反向遍历找出前方w数
            j = i-1;
            // 合并之前的w
            while (necklace[j] == 'w') {
                j--;
            }
            j = i-j-1;
            // 找出当前temp 包含当前或w
            while (necklace[i] == temp_c || necklace[i] == 'w') {
                temp++;
                i++;
            }
            if (temp+prev <= n) {
                result = max(result, temp+prev);
            }
            // 由于每一个temp只考虑它和它后面的w，不考虑前面的w，所以当变成prev前要把当前temp的数量加上之前的w个数
            prev = temp+j;
        }
    }
    cout << result;
    return 0;
}
