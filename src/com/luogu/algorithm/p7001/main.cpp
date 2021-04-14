#include <iostream>
#include <vector>

using namespace std;

vector<string> str;

int main() {
    string pattern, temp;
    int n;
    cin >> pattern >> n;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        bool flag = true;
        for (int j = 0; j < 9; j++) {
            if (pattern[j] != '*' && pattern[j] != temp[j]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            str.push_back(temp);
        }
    }
    cout << str.size() << endl;
    for (auto & s : str) {
        cout << s << endl;
    }
    return 0;
}
