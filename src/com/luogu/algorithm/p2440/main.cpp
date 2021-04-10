#include <iostream>

using namespace std;

long long n, k, nums[1000001];

bool judge(long long x) {
    long long result = 0;
    for (int i = 0; i < n; i++) {
        result += nums[i] / x;
    }
    return result >= k;
}

int main() {
    cin >> n >> k;
    long long max_len = 0;
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
        max_len = max(max_len, nums[i]);
    }
    long long left = 0, right = max_len, mid;
    while (left + 1 < right) {
        mid = (left + right) / 2;
        if (judge(mid)) {
            left = mid;
        } else {
            right = mid;
        }
    }
    cout << left;
    return 0;
}
