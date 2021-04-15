#include <iostream>
#include <map>

using namespace std;

map<string, int> students;

int main() {
    int n, cmd, score;
    string name;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> cmd;
        switch (cmd) {
            case 1:
                cin >> name >> score;
                students[name] = score;
                cout << "OK" << endl;
                break;
            case 2:
                cin >> name;
                if (students.count(name) == 1) {
                    cout << students[name] << endl;
                } else {
                    cout << "Not found" << endl;
                }
                break;
            case 3:
                cin >> name;
                if (students.count(name) == 1) {
                    students.erase(name);
                    cout << "Deleted successfully" << endl;
                } else {
                    cout << "Not found" <<endl;
                }
                break;
            case 4:
                cout << students.size() << endl;
                break;
        }
    }
    return 0;
}
