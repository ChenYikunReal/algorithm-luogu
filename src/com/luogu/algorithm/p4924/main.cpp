#include <iostream>

using namespace std;

int graph[521][521], temp[521][521];

int main() {
    int n, m, x, y, r, z;
    cin >> n >> m;
    // 初始化
    for(int i = 0, j, k = 1; i < n; i++) {
        for (j = 0; j < n; j++, k++) {
            graph[i][j] = k;
        }
    }
    // 循环模拟
    for (int i = 0; i < m; i++) {
        cin >> x >> y >> r >> z;
        x--;
        y--;
        // 暂存
        for (int j = -r; j <= r; j++) {
            for (int k = -r; k <= r; k++) {
                temp[x+j][y+k] = graph[x+j][y+k];
            }
        }
        // 逆时针转置
        if (z) {
            for (int j = -r; j <= r; j++) {
                for (int k = -r; k <= r; k++) {
                    graph[x-k][y+j] = temp[x+j][y+k];
                }
            }
        } else {    // 顺时针转置
            for (int j = -r; j <= r; j++) {
                for (int k = -r; k <= r; k++) {
                    graph[x+k][y-j] = temp[x+j][y+k];
                }
            }
        }
    }
    // 输出
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << graph[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
