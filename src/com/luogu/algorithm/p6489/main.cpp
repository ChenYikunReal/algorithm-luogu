#include <iostream>

using namespace std;

int mountain[1234];

int main() {
    int n, result = 0, start, end;
    cin >> n;
    start = 0;
    for (int i = 0; i < n; i++) {
        cin >> mountain[i];
    }
    for (end = 1; end < n; end++) {
        if (mountain[end] <= mountain[end-1]) {
            result = max(mountain[end-1]-mountain[start], result);
            start = end;
        }
    }
    result = max(mountain[end-1]-mountain[start], result);
    cout << result;
    return 0;
}
