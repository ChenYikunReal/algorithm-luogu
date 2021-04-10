#include <iostream>
#include <map>

using namespace std;

map<int,int> bowling;

int main() {
    int n, m, j;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> m;
        bowling[m] = i;
    }
    cin >> m;
    for (int i = 0; i < m; i++) {
        cin >> j;
        cout << bowling[j] << endl;
    }
    return 0;
}
