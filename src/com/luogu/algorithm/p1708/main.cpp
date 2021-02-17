#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    long long x = 0, y = 0, temp;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        x += temp;
        cin >> temp;
        y += temp;
    }
    for (int i = 0; i < n; i++) {
        cin >> temp;
        x -= temp;
        cin >> temp;
        y -= temp;
    }
    cout << abs(x) + abs(y) << endl;
    return 0;
}
