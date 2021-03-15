#include <iostream>
#include <cmath>

using namespace std;

int graph[201][201], dp[201];

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j < n; j++) {
            cin >> graph[i][j];
        }
        dp[i] = 0x7f7f7f7f;
    }
    for (int i = n-2; i >= 0; i--) {
        for (int j = i+1; j < n; j++) {
            dp[i] = min(dp[i], graph[i][j]+dp[j]);
        }
    }
    cout << dp[0];
    return 0;
}
