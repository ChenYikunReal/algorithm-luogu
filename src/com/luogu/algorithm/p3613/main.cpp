#include <iostream>
#include <map>

using namespace std;

map<int,map<int,int>> a;

int main() {
    int n, q, x, y, k, z;
    cin >> n >> q;
    for (int i = 0; i < q; i++) {
        cin >> k >> x >> y;
        if (k == 1) {
            cin >> z;
            a[x][y] = z;
        } else {
            cout << a[x][y] << endl;
        }
    }
    return 0;
}
