#include <iostream>
#include <fstream>

using namespace std;

int trees[1000001];

int main() {
    int n, m, left = 0, right = 0, mid;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> trees[i];
        right = max(right, trees[i]);
    }
    long long sum = 0;
    while (left <= right) {
        sum = 0;
        mid = left + (right-left)/2;
        for (int i = 0; i < n; i++) {
            sum += max(trees[i]-mid, 0);
        }
        if (sum < m) {
            right = mid-1;
        } else {
            left = mid+1;
        }
    }
    cout << left-1;
    return 0;
}
