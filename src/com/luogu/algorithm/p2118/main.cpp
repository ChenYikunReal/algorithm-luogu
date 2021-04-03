#include <iostream>

using namespace std;

// gcd()函数
int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a%b);
}

int main() {
    int a, b, limit, a_result, b_result;
    cin >> a >> b >> limit;
    a_result = limit;
    b_result = 1;
    // 遍历到恰好不越界
    for (int i = 1; i <= limit; i++) {
        for (int j = 1; j <= limit; j++) {
            // 首先是A’和B'不可约分，其次是A‘/B'>A/B且A'/B'-A/B尽可能小
            if (gcd(i, j)==1 && i*b>=j*a && i*b_result<j*a_result) {
                a_result = i;
                b_result = j;
            }
        }
    }
    cout << a_result << " " << b_result;
    return 0;
}
