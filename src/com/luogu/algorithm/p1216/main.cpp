#include <iostream>
#include <cmath>

using namespace std;

int nums[1001][1001], result[1001][1001];

int main() {
    int r;
    cin >> r;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j <= i; j++) {
            cin >> nums[i][j];
        }
    }
    for (int i = r-1; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            result[i][j] = max(result[i+1][j+1], result[i+1][j]) + nums[i][j];
        }
    }
    cout << result[0][0];
    return 0;
}
