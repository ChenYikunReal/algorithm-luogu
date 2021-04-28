#include <iostream>

using namespace std;

bool flag[10];

bool check_bits(int a) {
    while (a) {
        if (!flag[a%10]) {
            return false;
        }
        a /= 10;
    }
    return true;
}

bool check(int a, int b) {
    int x = a*(b%10), y = a*(b/10), z = a*b;
    return x < 1000 && y < 1000 && z < 10000 && check_bits(a) && check_bits(b) && check_bits(x) && check_bits(y) && check_bits(z);
}

int main() {
    int n, a, ans = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a;
        flag[a] = true;
    }
    for (int i = 100; i < 1000; i++) {
        for (int j = 10; j < 100; j++) {
            if (check(i, j)) {
                ans++;
            }
        }
    }
    cout << ans;
    return 0;
}
