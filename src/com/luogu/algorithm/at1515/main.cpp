#include <iostream>
#include <cmath>

using namespace std;

int main() {
    double a, b, c, d;
    cin >> a >> b >> c >> d;
    b /= a;
    d /= c;
    // 不换行会WA
    cout << (fabs(b-d)<=1e-5 ? "DRAW" : b > d ? "TAKAHASHI" : "AOKI") << endl;
    return 0;
}
