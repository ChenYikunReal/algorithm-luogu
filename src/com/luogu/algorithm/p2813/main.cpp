#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int m, n;
    cin >> m >> n;
    int enemy[m], me[n];
    for (int i = 0; i < m; i++) {
        cin >> enemy[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> me[i];
    }
    if (m > n) {
        cout << 0;
        return 0;
    }
    sort(enemy, enemy+m);
    sort(me, me+n);
    bool flag = false;
    for (int i = 0, j = 0; i < m && j < n;) {
        if (me[j] > enemy[i]) {
            me[j] = 0;
            if (i == m-1) {
                flag = true;
            }
            i++;
            j++;
        }
        while (me[j] <= enemy[i] && j < n) {
            j++;
        }
    }
    if (flag) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += me[i];
        }
        cout << result;
    } else {
        cout << 0;
    }
    return 0;
}
