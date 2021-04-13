#include <iostream>
#include <string>
#include <set>
#include <map>

using namespace std;

map<char, set<int>> sets;
set<int> p, k, h, t;

int main() {
    string s;
    cin >> s;
    sets['P'] = p;
    sets['K'] = k;
    sets['H'] = h;
    sets['T'] = t;
    int index;
    for (int i = 0; i < s.length(); i+=3) {
        index = stoi(s.substr(i+1, i+3));
        if (sets[s[i]].count(index)) {
            cout << "GRESKA";
            return 0;
        }
        sets[s[i]].insert(index);
    }
    cout << 13-sets['P'].size() << " " << 13-sets['K'].size() << " " << 13-sets['H'].size() << " " << 13-sets['T'].size();
    return 0;
}
