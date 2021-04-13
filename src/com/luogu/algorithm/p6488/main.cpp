#include <iostream>

using namespace std;

int main() {
    long long squre, per;
    cin >> squre >> per;
    squre *= per;
    for (int i = 0; i < 5; i++) {
        cin >> per;
        cout << per - squre << " ";
    }
    return 0;
}
