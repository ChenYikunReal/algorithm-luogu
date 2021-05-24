#include <iostream>
#include <map>

using namespace std;

map<int, bool> nums;

int bit_width = 0, min_num, max_num, base = 1, ans = 0;

bool judge_same(int x) {
    int y = x % 10;
    x /= 10;
    while (x > 0) {
        int z = x % 10;
        if (z != y) {
            return false;
        }
        x /= 10;
    }
    return true;
}

void check(int x) {
    nums.clear();
    int y = x;
    for (int i = 1; i < bit_width; i++) {
        // 移位
        y = (y%10)*base + (y/10);
        if (y >= min_num && y <= max_num && y > x && !nums[y]) {
            ans++;
            nums[y] = true;
        }
    }
}

int main() {
    cin >> min_num >> max_num;
    int y = min_num;
    while (y > 0) {
        y /= 10;
        bit_width++;
        base *= 10;
    }
    base /= 10;
    for (int i = min_num; i < max_num; i++) {
        if (!judge_same(i)) {
            check(i);
        }
    }
    cout << ans;
    return 0;
}
