#include <iostream>

using namespace std;

int nums[1001][1001];

int main() {
    char c;
    int n, m, top_view = 0, side_view = 0, front_view = 0;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> c;
            nums[i][j] = c-'0';
        }
    }
    // 俯视图
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (nums[i][j] > 0) {
                top_view++;
            }
        }
    }
    // 主视图
    for (int j = 0; j < m; j++) {
        front_view += nums[0][j];
        for (int i = 1; i < n; i++) {
            if (nums[i][j] > nums[i-1][j]) {
                front_view += (nums[i][j]-nums[i-1][j]);
            }
        }
    }
    // 侧视图
    for (int i = 0; i < n; i++) {
        side_view += nums[i][0];
        for (int j = 1; j < m; j++) {
            if (nums[i][j] > nums[i][j-1]) {
                side_view += (nums[i][j]-nums[i][j-1]);
            }
        }
    }
    cout << (front_view + side_view + top_view) * 2;
    return 0;
}
