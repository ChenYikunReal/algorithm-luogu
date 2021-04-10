#include <iostream>
#include <algorithm>

int schools[100001];

using namespace std;

int main() {
    int m, n, score, result = 0, index;
    cin >> m >> n;
    for (int i = 0; i < m; i++) {
        cin >> schools[i];
    }
    sort(schools, schools+m);
    for (int i = 0; i < n; i++) {
        cin >> score;
        index = lower_bound(schools, schools+m, score) - schools;
        if (index == m) {
            result += (score - schools[m-1]);
        } else if (index == 0) {
            result += (schools[0]-score);
        } else {
            result += min(abs(schools[index]-score), abs(score-schools[index-1]));
        }
    }
    cout << result;
    return 0;
}
