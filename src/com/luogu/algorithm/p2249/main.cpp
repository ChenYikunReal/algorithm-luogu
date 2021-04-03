#include <iostream>

using namespace std;

int nums[1000001];

int main() {
    int n, m, query;
    cin >> n >> m;
    // 因为结果计算的下标是从1开始的
    for (int i = 1; i <= n; i++) {
        cin >> nums[i];
    }
    for (int i = 0; i < m; i++) {
        cin >> query;
        int result = lower_bound(nums+1, nums+n+1, query)-nums;
        cout << ((query == nums[result]) ? result : -1) << " ";
    }
    return 0;
}
