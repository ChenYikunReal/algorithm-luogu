#include <iostream>
#include <algorithm>

using namespace std;

struct Farmer {
    int left, right;
};

bool cmp (Farmer a, Farmer b) {
    return a.left < b.left;
}

Farmer farmers[5050];

int main() {
    // 统计时间从第一个挤奶的开始
    int n, max_a, max_b = 0, temp_left, temp_right;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> farmers[i].left >> farmers[i].right;
    }
    sort(farmers, farmers+n, cmp);
    temp_left = farmers[0].left;
    temp_right = farmers[0].right;
    max_a = temp_right-temp_left;
    for (int i = 1; i < n; i++) {
        if (farmers[i].left <= temp_right) {
            // 合并区间
            temp_right = max(temp_right, farmers[i].right);
        } else {
            // 有人挤奶的时间
            max_a = max(max_a, temp_right-temp_left);
            // 无人挤奶的时间
            max_b = max(max_b, farmers[i].left-temp_right);
            // 更新新的区间范围
            temp_left = farmers[i].left;
            temp_right = farmers[i].right;
        }
    }
    cout << max_a << " " << max_b;
    return 0;
}
