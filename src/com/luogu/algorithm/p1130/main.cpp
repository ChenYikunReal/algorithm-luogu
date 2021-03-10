#include <iostream>
#include <cmath>

using namespace std;

int nums[2001][2001], result[2001][2001];

int main() {
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> nums[i][j];
        }
    }
    for (int j = n-1; j >= 0; j--) {
        for (int i = 0; i < m; i++) {
            result[i][j] = min(result[(i+1)%m][j+1], result[i][j+1]) + nums[i][j];
        }
    }
    int min_result = 0x7f7f7f;
    for (int i = 0; i < m; i++) {
        min_result = min(min_result, result[i][0]);
    }
    cout << min_result;
    return 0;
}
