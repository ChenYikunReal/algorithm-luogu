#include <iostream>

using namespace std;

int main() {
    long long n, i, j, min_num, result;
    cin >> n >> i >> j;
    min_num = min(i, min(j, min(n - i + 1, n - j + 1)));
    result = i > j ? min_num * (4 * n - 4 * min_num) + 2 * min_num + 1 - i - j : min_num * (4 * (n - 1) - 4 * min_num) + 10 * min_num - 4 * n - 3 + i + j;
    cout << result;
    return 0;
}
