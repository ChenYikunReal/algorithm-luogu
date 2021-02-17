#include <iostream>

using namespace std;

// 确保初始化
int count[26];

int main() {
    string s;
    cin >> s;
    for (int i = 0; i < s.size(); i++) {
        count[s[i] - 'a']++;
    }
    int result = 0;
    for (int i = 0; i < 26; i++) {
        result = max(result, count[i]);
    }
    cout << result;
    return 0;
}
