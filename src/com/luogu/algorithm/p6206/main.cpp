#include <iostream>

using namespace std;

int main() {
    long long n, counter = 0;
    cin >> n;
    while (n != 1) {
        if ((n&1) == 0) {
            n /= 2;
        } else {
            n = 3 * n + 1;
        }
        counter++;
    }
    cout << counter;
    return 0;
}
