#include <iostream>

using namespace std;

int ujset[1001];

int find_fun(int x) {
    return ujset[x] == x ? x : (ujset[x] = find_fun(ujset[x]));
}

void union_fun(int x, int y) {
    ujset[find_fun(y)] = find_fun(x);
}

int main() {
    int n, m, x, y, counter;
    while (cin >> n) {
        if (n == 0) {
            break;
        }
        cin >> m;
        // 初始化并查集，由于存在初始化，所以多组数据并没有问题
        for (int i = 1; i <= n; i++) {
            ujset[i] = i;
        }
        // 合并
        for (int i = 0; i < m; i++) {
            cin >> x >> y;
            union_fun(x, y);
        }
        // 计算
        counter = 0;
        for (int i = 1; i <= n; i++) {
            if (find_fun(i) == i) {
                counter++;
            }
        }
        cout << counter-1 << endl;
    }
    return 0;
}
