#include <iostream>
#include <cmath>

using namespace std;

int nums[50];

int main() {
    int n, l, r, sum = 0, less = 0, more = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
        sum += nums[i];
    }
    cin >> l >> r;
    if (sum > n*r || sum < n*l) {
        cout << -1;
        return 0;
    }
    for (int i = 0; i < n; i++) {
        if (nums[i] < l) {
            less += (l-nums[i]);
        } else if (nums[i] > r) {
            more += (nums[i]-r);
        }
    }
    cout << max(more, less);
    return 0;
}
