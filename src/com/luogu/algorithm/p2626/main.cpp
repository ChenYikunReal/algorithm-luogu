#include <iostream>
#include <cmath>

using namespace std;

const int mod = pow(2, 31);

int fib[49] = {0, 1, 1};

int main() {
    int n;
    cin >> n;
    for (int i = 3; i <= n; i++) {
        fib[i] = (fib[i-1] + fib[i-2]) % mod;
    }
    cout << fib[n] << "=";
    bool flag = false;
    for (int i = 2; i <= fib[n]; i++) {
        while (fib[n] % i == 0) {
            if (!flag) {
                flag = true;
                cout << i;
            } else {
                cout << '*' << i;
            }
            fib[n] /= i;
        }
    }
    return 0;
}
