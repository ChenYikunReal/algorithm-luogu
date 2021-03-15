#include <iostream>

using namespace std;

int p[10010];

int main() {
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> p[i];
    }
    int counter = m, result = 0;
    while (counter < n+m) {
        for (int i = 0; i < m; i++) {
            p[i]--;
            if (p[i] == 0) {
                p[i] = p[counter];
                counter++;
            }
        }
        result++;
    }
    cout << result;
    return 0;
}
