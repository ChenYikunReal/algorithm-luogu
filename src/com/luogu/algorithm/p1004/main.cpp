#include <iostream>

using namespace std;

int f[10][10][10][10], graph[10][10];

int main() {
    int n, x, y, m;
    cin >> n >> x >> y >> m;
    while (x != 0 || y != 0 || m != 0) {
        graph[x][y] = m;
        cin >> x >> y >> m;
    }
    // 四维DP未优化
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                for (int p = 1; p <= n; p++){
                    f[i][j][k][p] = max(max(f[i-1][j][k-1][p], f[i-1][j][k][p-1]), max(f[i][j-1][k-1][p], f[i][j-1][k][p-1])) + graph[i][j] + graph[k][p];
                    if (i == k && p == j) {
                        f[i][j][k][p] -= graph[i][j];
                    }
                }
            }
        }
    }
    cout << f[n][n][n][n];
    return 0;
}
