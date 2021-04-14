#include <iostream>

using namespace std;

int values[31], dp[31][2701];

int main() {
    int m, r, n, sum_value = 0, result = 0;
    cin >> m >> r >> n;
    for (int i = 1; i <= m; i++) {
        cin >> values[i];
        sum_value += values[i];
    }
    dp[0][0] = 1;
    for (int i = 1; i <= m; i++) {
        for (int j = r; j >= 1; j--) {
            // sum_value最大也就是2700了，爆不掉数组
            for (int k = values[i]; k <= sum_value; k++) {
                dp[j][k] += dp[j-1][k-values[i]];
            }
        }
    }
    for (int i = n+1; i <= sum_value; i++) {
        result += dp[r][i];
    }
    cout << result;
    return 0;
}
