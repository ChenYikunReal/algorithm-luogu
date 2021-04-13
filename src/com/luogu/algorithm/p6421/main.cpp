#include <iostream>

using namespace std;

bool nums[1111];

int main() {
    int n, k, counter = 0, result = 0;
    cin >> n >> k;
    for (int i = 2; i <= n && counter < k; i++) {
        if (nums[i]) {
            continue;
        }
        for (int j = 1; j <= n/i && counter < k; j++) {
            if (!nums[i*j]) {
                nums[i*j] = true;
                result = i*j;
                counter++;
            }
        }
    }
    cout << result;
    return 0;
}
