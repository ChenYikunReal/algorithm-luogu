#include <iostream>
#include <cstring>

using namespace std;

int trees[10001];

int main() {
    int length, n, ans1 = 0, ans2 = 0, cmd, start, end;
    cin >> length >> n;
    memset(trees, -1, sizeof(trees));
    for (int i = 0; i < n; i++) {
        cin >> cmd >> start >> end;
        if (cmd) {    // 种树
            for (int j = start; j <= end; j++) {
                if (!trees[j]) {   // 被砍掉了
                    trees[j] = 1;
                }
            }
        } else {    // 砍树
            for (int j = start; j <= end; j++) {
                if (trees[j] == -1) {   // 还没被砍过
                    trees[j] = 0;
                } else if (trees[j] == 1) {
                    trees[j] = 0;
                    ans2++;
                }
            }
        }
    }
    for (int i = 0; i <= length; i++) {
        if (trees[i] > 0) {
            ans1++;
        }
    }
    cout << ans1 << endl << ans2;
    return 0;
}
