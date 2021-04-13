#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int m, n, k, result;
    cin >> m >> n >> k;
    if (m >= n*2) {
        if (m - n*2 >= k) {
            result = n;
        } else {
            result = n-(int)ceil((k-(m-2*n))/3.0);
        }
    } else {
        if (2*n - m >= 2*k) {
            result = m/2;
        } else {
            result = n-(n-(int)ceil(m/2.0))-(int)ceil((k-n+(int)ceil(m/2.0))/3.0);
        }
    }
    cout << max(result, 0);
    return 0;
}
