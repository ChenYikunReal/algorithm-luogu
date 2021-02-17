#include <iostream>
#include <algorithm>

using namespace std;

struct oj {
    int begin, end;
};

bool compare(oj a, oj b) {
    return a.end > b.end ? 0 : 1;
}

int main() {
    int n, result = 0, end;
    cin >> n;
    oj ojs[n];
    for (int i = 0; i < n; i++) {
        cin >> ojs[i].begin >> ojs[i].end;
    }
    sort(ojs, ojs+n, compare);
    end = ojs[0].end;
    result++;
    for (int i = 1; i < n;) {
        if (ojs[i].begin >= end) {
            end = ojs[i].end;
            result++;
            i++;
        }
        while (ojs[i].begin < end) {
            i++;
        }
    }
    cout << result << endl;
    return 0;
}
