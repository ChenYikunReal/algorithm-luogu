#include <iostream>

using namespace std;

const long long mod = 1e9+7;

int nums[100100], visited[100100];

long long combine(long long k) {
    // $C_{k}^{2}$ 然后取模
    return ((k*(k-1))/2)%mod;
}

int main() {
    int n, max_len = -1, i, j;
    cin >> n;
    for (i = 0; i < n; i++) {
        cin >> nums[i];
        max_len = max(max_len, nums[i]);
        visited[nums[i]]++;
    }
    long long result = 0;
    for (i = 0; i < max_len; i++) {
        for (j = i; j < max_len; j++) {
            if (i == j) {
                result = (result+(combine(visited[i])*combine(visited[i+j])))%mod;
            } else {
                result = (result+((visited[i]*visited[j])%mod*combine(visited[i+j]))%mod)%mod;
            }
        }
    }
    cout << result;
    return 0;
}
