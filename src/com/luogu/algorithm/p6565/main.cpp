#include <iostream>
#include <algorithm>

using namespace std;

struct Person {
    string name;
    int sos_num = 0, id;
} persons[123];

bool cmp(Person a, Person b) {
    if (a.sos_num == b.sos_num) {
        return a.id < b.id;
    }
    return a.sos_num > b.sos_num;
}

int main() {
    int n;
    cin >> n;
    string temp_sos;
    for (int i = 0; i < n; i++) {
        cin >> persons[i].name >> temp_sos;
        persons[i].id = i;
        // 这点不注意会导致后三个点RE
        if (temp_sos.length() >= 3) {
            for (int j = 0; j < temp_sos.length()-2; j++) {
                if (temp_sos[j] == 's' && temp_sos[j+1] == 'o' && temp_sos[j+2] == 's') {
                    persons[i].sos_num++;
                }
            }
        }
    }
    sort(persons, persons+n, cmp);
    int max_sos_num = persons[0].sos_num;
    for (int i = 0; i < n; i++) {
        if (persons[i].sos_num == max_sos_num) {
            cout << persons[i].name << " ";
        } else {
            break;
        }
    }
    cout << endl << max_sos_num;
    return 0;
}
