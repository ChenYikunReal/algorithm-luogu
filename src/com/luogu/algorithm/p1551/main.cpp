#include <iostream>

using namespace std;

int ujset[5005];

int find_fun(int x) {
    // 要么自身就是祖先，要么就是往上递归查询并顺便更新赋值
    return ujset[x] == x ? x : (ujset[x]= find_fun(ujset[x]));
}

void union_fun(int x, int y) {
    // y的祖先设置为x的祖先
    ujset[find_fun(y)] = find_fun(x);
}

int main() {
    int n, m, p, mi, mj, pi, pj;
    cin >> n >> m >> p;
    // 初始化自己的祖先节点为自己
    for (int i = 1; i <= n; i++) {
        ujset[i] = i;
    }
    for (int i = 0; i < m; i++) {
        cin >> mi >> mj;
        union_fun(mi, mj);
    }
    for (int i = 0; i < p; i++) {
        cin >> pi >> pj;
        cout << (find_fun(pi) == find_fun(pj) ? "Yes" : "No") << endl;
    }
    return 0;
}
