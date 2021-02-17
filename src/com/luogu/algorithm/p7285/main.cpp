#include <iostream>

using namespace std;

int main() {
    int n, m, temp, one_count;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> m;
        one_count = 0;
        for (int j = 0; j < m; j++) {
            cin >> temp;
            if (temp == 1) {
                one_count++;
            }
        }
        cout << one_count << endl;
        for (int j = 0; j < m; j++) {
            cout << 1 << ' ';
        }
        cout<<endl;
    }
    return 0;
}
