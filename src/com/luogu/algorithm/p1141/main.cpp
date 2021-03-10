#include <iostream>
#include <cstring>

using namespace std;

int result[100002], temp_map[1002][1002], n;

char map[1002][1002];

void search(int x, int y, char temp, int i) {
    if (x < 0 || x > n-1 || y < 0 || y > n-1 || temp_map[x][y]!=-1 || map[x][y] == temp) {
        return;
    }
    temp_map[x][y] = i;
    result[i]++;
    search(x-1, y, map[x][y], i);
    search(x+1, y, map[x][y], i);
    search(x, y-1, map[x][y], i);
    search(x, y+1, map[x][y], i);
}

int main() {
    int m, x, y;
    scanf("%d %d", &n, &m);
    for (int i = 0; i < n; i++) {
        scanf("%s", map[i]);
    }
    memset(temp_map, -1, sizeof(temp_map));
    for (int i = 0; i < m; i++) {
        scanf("%d %d", &x, &y);
        x--;
        y--;
        if (temp_map[x][y]!=-1) {
            result[i] = result[temp_map[x][y]];
            continue;
        }
        search(x, y, map[x][y]=='0'?'1':'0', i);
    }
    for (int i = 0; i < m; i++) {
        printf("%d\n", result[i]);
    }
    return 0;
}
