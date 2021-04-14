#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int s, i, r = 0, n, temp_s, temp_i, temp_r;
    double alpha, beta;
    cin >> s >> i >> n >> alpha >> beta;
    for (int j = 0; j < n; j++) {
        temp_s = s;
        temp_i = i;
        temp_r = r;
        r += ceil(temp_i * beta);
        i -= ceil(temp_i * beta);
        i += ceil(alpha * temp_s * temp_i);
        s -= ceil(alpha * temp_s * temp_i);
        if (s < 0) {
            i += s;
            s = 0;
        }
        i = max(i, 0);
    }
    cout << s << " " << i << " " << r;
    return 0;
}
