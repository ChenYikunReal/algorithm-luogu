#include <iostream>

using namespace std;

int n, m, tree[500005];

int low_bit(int k) {
    return k & -k;
}

void add(int x, int k) {
    while (x <= n) {
        tree[x] += k;
        x += low_bit(x);
    }
}

int sum(int x) {
    int ans = 0;
    while(x != 0) {
        ans += tree[x];
        x -= low_bit(x);
    }
    return ans;
}

int main() {
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        int a;
        cin >> a;
        add(i, a);
    }
    for (int i = 1; i <= m; i++) {
        int a, b, c;
        cin >> a >> b >> c;
        if (a == 1) {
            add(b, c);
        } else if (a == 2) {
            cout << sum(c)-sum(b-1) << endl;
        }
    }
}
