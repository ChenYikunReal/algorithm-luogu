#include <iostream>
#include <cstring>
#include <cstdlib>

using namespace std;

int main() {
    string name, num;
    char temp_num[10];
    int st;
    cin >> name >> st;
    for (char i : name) {
        snprintf(temp_num, sizeof(temp_num), "%d", i-'A'+st);
//        itoa(i-'A'+st, temp_num, 10);
        for (int j = 0; j < strlen(temp_num); j++) {
            num.push_back(temp_num[j]);
        }
    }
    char nums[num.length()];
    for (int i = 0; i < num.length(); i++) {
        nums[i] = num[i];
    }
    for (int i = num.length(); i > 3; i--) {
        for (int j = 0; j < i-1; j++) {
            nums[j] = (char)((nums[j] + nums[j+1] - 2*'0') % 10 + '0');
        }
    }
    if (num.length() == 1) {
        cout << nums[0];
        return 0;
    } else if (num.length() >= 3) {
        if (nums[0] == '1' && nums[1] == '0' && nums[2] == '0') {
            cout << 100 << endl;
            return 0;
        } else {
            nums[0] = (char)((nums[0] + nums[1] - 2*'0') % 10 + '0');
            nums[1] = (char)((nums[1] + nums[2] - 2*'0') % 10 + '0');
        }
    }
    if (nums[0] == '0') {
        cout << nums[1] << endl;
    } else {
        cout << nums[0] << nums[1] << endl;
    }
    return 0;
}
