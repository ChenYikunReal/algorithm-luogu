#include <iostream>

using namespace std;

int graph[123][123];

int main() {
    int n, m, result = 0;
    char temp;
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            cin >> temp;
            if (temp == '*') {
                graph[i][j] = 1;
                if (graph[i-1][j] == 0 && graph[i][j-1] == 0) {
                    result++;
                }
            }
        }
    }
    cout << result;
    return 0;
}
