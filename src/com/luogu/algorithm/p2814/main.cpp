#include <iostream>
#include <map>

using namespace std;

map<string, string> family;

string search(string s) {
    if (s != family[s]) {
        family[s] = search(family[s]);
    }
    return family[s];
}

int main() {
    char cmd;
    string parent, son;
    cin >> cmd;
    while (cmd != '$') {
        cin >> son;
        switch (cmd) {
            case '#':
                parent = son;
                if (family[son] == "") {
                    family[son] = son;
                }
                break;
            case '+':
                family[son] = parent;
                break;
            default:
                cout << son << ' ' << search(son) << endl;
                break;
        }
        cin >> cmd;
    }
    return 0;
}
