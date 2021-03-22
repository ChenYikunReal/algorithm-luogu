#include <iostream>

using namespace std;

string name[100000];

// 0向内，1向外
int side[100000];

// 向内的人左小右大，向外的人左大右小
int main() {
    int n, m, ptr = 0, a, s;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> side[i] >> name[i];
    }
    for (int i = 0; i < m; i++) {
        cin >> a >> s;
        if ((a == 0 && side[ptr] == 0) || (a == 1 && side[ptr] == 1)) { //减
            // 负数取模会得负数
            ptr = (ptr - s + n) % n;
        } else {    //加
            ptr = (ptr + s) % n;
        }
    }
    // cout << ptr;
    cout << name[ptr];
    return 0;
}
