#include <iostream>
#include <algorithm>

using namespace std;

struct Ship {
    int start, end;
} ships[23333];

bool cmp(Ship a, Ship b) {
    return a.start < b.start;
}

int main() {
    int n, start, end, sum = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> ships[i].start >> ships[i].end;
    }
    sort(ships, ships+n, cmp);
    start = ships[0].start;
    end = ships[0].end;
    for (int i = 1; i < n; i++) {
        if (ships[i].start <= end) {
            end = max(end, ships[i].end);
        } else {
            sum += (end - start);
            start = ships[i].start;
            end = ships[i].end;
        }
    }
    sum += (end - start);
    cout << sum;
    return 0;
}
