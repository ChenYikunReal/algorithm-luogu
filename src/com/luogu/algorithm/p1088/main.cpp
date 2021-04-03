#include <iostream>
#include <algorithm>

using namespace std;

int nums[10010];

int main() {
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }
    while (m--) {
        next_permutation(nums, nums+n);
    }
    for (int i = 0; i < n; i++) {
        cout << nums[i] << " ";
    }
    return 0;
}
