#include <iostream>
#include <algorithm>

using namespace std;

struct Coin {
    double m, v;
};

bool cmp (Coin a, Coin b) {
    return a.v/a.m > b.v/b.m;
}

Coin coins[101];

int main() {
    int n, t;
    cin >> n >> t;
    for (int i = 0; i < n; i++) {
        cin >> coins[i].m >> coins[i].v;
    }
    sort(coins, coins+n, cmp);
    double result = 0;
    for (int i = 0; i < n && t > 1e-6; i++) {
        result += (min((double)t, coins[i].m)*(coins[i].v/coins[i].m));
        t -= min((double)t, coins[i].m);
    }
    printf("%.2f", result);
    return 0;
}
