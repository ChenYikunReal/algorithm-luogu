#include <iostream>
#include <map>

using namespace std;

map<int,int> wood;

int main() {
    int n, cmd, length;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> cmd >> length;
        switch (cmd) {
            case 1:
                if (wood.count(length)) {
                    cout << "Already Exist" << endl;
                } else {
                    wood[length] = 1;
                }
                break;
            case 2:
                if (wood.empty()) {
                    cout << "Empty" << endl;
                } else if (wood.count(length)) {
                    wood.erase(length);
                    cout << length << endl;
                } else {
                    wood[length] = 1;
                    auto pointer1 = wood.find(length);
                    auto pointer2 = pointer1;
                    pointer1++;
                    if (pointer2 == wood.begin()) {
                        cout << pointer1->first << endl;
                        wood.erase(pointer1);
                    } else if (pointer1 == wood.end()) {
                        pointer2--;
                        cout << (pointer2)->first << endl;
                        wood.erase(pointer2);
                    } else if (length-(--pointer2)->first > pointer1->first-length) {
                        cout << pointer1->first << endl;
                        wood.erase(pointer1);
                    } else {
                        cout << pointer2->first << endl;
                        wood.erase(pointer2);
                    }
                    wood.erase(length);
                    break;
                }
        }
    }
    return 0;
}
