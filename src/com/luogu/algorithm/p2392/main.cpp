#include <iostream>
#include <cstring>

using namespace std;

int homework[20], dp[1234];

int main() {
    int nums[4], i, j, k, sum, result = 0;
    for (i = 0; i < 4; i++) {
        cin >> nums[i];
    }
    for (i = 0; i < 4; i++) {
        sum = 0;
        for (j = 0; j < nums[i]; j++) {
            cin >> homework[j];
            sum += homework[j];
        }
        for (j = 0; j < nums[i]; j++) {
            for (k = sum/2; k >= homework[j]; k--) {
                dp[k] = max(dp[k], dp[k-homework[j]]+homework[j]);
            }
        }
        result += sum - dp[sum / 2];
        memset(dp, 0, sizeof(dp));
    }
    cout << result;
    return 0;
}
