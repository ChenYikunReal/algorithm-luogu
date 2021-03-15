#include <iostream>
#include <cmath>

using namespace std;

int weekly[10010];

int main() {
    int n, s, cost, y;
    long long result = 0;
    cin >> n >> s>> weekly[0] >> y;
    result += weekly[0]*y;
    for (int i = 1; i < n; i++) {
        cin >> cost >> y;
        weekly[i] = min(weekly[i-1]+s, cost);
        result += weekly[i]*y;
    }
    cout << result;
    return 0;
}
