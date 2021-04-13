#include <iostream>

using namespace std;

// 本地没法跑这种程序，但可以AC
int main() {
    int result = 1;
    char c;
    while (cin >> c) {
        if (c == 'A') {
            if (result == 1) {
                result = 2;
            } else if (result == 2) {
                result = 1;
            }
        } else if (c == 'B') {
            if (result == 2) {
                result = 3;
            } else if (result == 3) {
                result = 2;
            }
        } else {
            if (result == 1) {
                result = 3;
            } else if (result == 3) {
                result = 1;
            }
        }
    }
    cout << result;
    return 0;
}
