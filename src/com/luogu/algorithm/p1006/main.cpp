#include <iostream>

using namespace std;

int f[51][51][51][51], graph[51][51];

int main() {
    int m, n;
    cin >> m >> n;
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            cin >> graph[i][j];
        }
    }
    // 四维DP未优化
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= m; k++) {
                for (int p = 1; p < j; p++){
                    f[i][j][k][p] = max(max(f[i-1][j][k-1][p], f[i-1][j][k][p-1]), max(f[i][j-1][k-1][p], f[i][j-1][k][p-1])) + graph[i][j] + graph[k][p];
                }
            }
        }
    }
    cout << f[m-1][n][m][n-1];
    return 0;
}
