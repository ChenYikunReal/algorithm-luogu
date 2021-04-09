#include <iostream>

using namespace std;

int list[501];

struct Work {
    // 在第id台机器上加工
    int id;
    // 花费cost时间
    int cost;
} works[21][21];    // works[第几个工件][第几步]

// mac[机器编号][时间]
int mac[21][100001] = {0};

// 每个工件加工到了第几步
int step[21] = {0};

// 每个工件上次是last_time[工件编号]时加工完的
int last_time[21] = {0};

int main() {
    int m, n, result = 0;
    cin >> m >> n;
    for (int i = 1; i <= m*n; i++) {
        cin >> list[i];
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            cin >> works[i][j].id;
        }
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            cin >> works[i][j].cost;
        }
    }
    for (int i = 1; i <= m*n; i++) {
        int now = list[i];
        step[now]++;
        int id = works[now][step[now]].id, cost = works[now][step[now]].cost;
        int s = 0;
        for (int j = last_time[now]+1; ; j++) {
            if (mac[id][j] == 0) {
                s++;
            } else {
                s = 0;
            }
            if (s == cost) {
                for (int k = j-cost+1; k <= j; k++) {
                    mac[id][k] = 1;
                }
                if (j > result) {
                    result = j;
                }
                last_time[now] = j;
                break;
            }
        }
    }
    cout << result;
    return 0;
}
