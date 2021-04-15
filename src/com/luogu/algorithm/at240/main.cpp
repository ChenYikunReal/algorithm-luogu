#include <iostream>

using namespace std;

int main() {
    long long n, prev = 1, next = 1, temp;
    cin >> n;
    if (n == 0) {
        cout << 1 << endl;
    } else if (n == 1) {
        cout << 1 << endl;
    } else {
        for (int i = 2; i <= n; i++) {
            temp = prev;
            prev = next;
            next += temp;
        }
        cout << next << endl;
    }
    return 0;
}
