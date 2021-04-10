#include <iostream>

using namespace std;

int cd[1001], dp[1001];

int main() {
    int n;
    cin >> n;
    // 预处理，类似于筛法
    for (int i = 1; i <= n/2; i++) {
        for (int j = 2; i*j <= n; j++) {
            cd[i*j] += i;
        }
    }
    // DP
    for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
            dp[j] = max(dp[j], dp[j-i]+cd[i]);
        }
    }
    cout << dp[n];
    return 0;
}
