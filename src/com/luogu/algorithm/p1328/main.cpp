#include <iostream>

using namespace std;

int seq_a[201], seq_b[201];

int judge[5][5] = {
        {0, 0, 1, 1, 0},
        {1, 0, 0, 1, 0},
        {0, 1, 0, 0, 1},
        {0, 0, 1, 0, 1},
        {1, 1, 0, 0, 0}
};

int main() {
    int n, t_a, t_b, count_a = 0, count_b = 0;
    cin >> n >> t_a >> t_b;
    for (int i = 0; i < t_a; i++) {
        cin >> seq_a[i];
    }
    for (int i = 0; i < t_b; i++) {
        cin >> seq_b[i];
    }
    for (int i = 0; i < n; i++) {
        count_a += (judge[seq_a[i%t_a]][seq_b[i%t_b]]);
        count_b += (judge[seq_b[i%t_b]][seq_a[i%t_a]]);
    }
    cout << count_a << " " << count_b;
    return 0;
}
