#include <iostream>

using namespace std;

int f[2021];

int main() {
    int h, k;
    cin >> h >> k;
    f[0] = k+1;
    int temp = f[0]+k+1;
    for (int i = 1; i <= h; i++) {
        f[i] = temp;
        temp += f[i];
    }
    cout << f[h];
    return 0;
}
