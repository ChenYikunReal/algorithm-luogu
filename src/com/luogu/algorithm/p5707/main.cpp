#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int s, v, all_time, minute = 60, hour = 24+8;
    cin >> s >> v;
    all_time = ceil(s/(double)v) + 10;
    minute -= (all_time % 60);
    minute %= 60;
    hour -= ceil(all_time/60.0);
    hour %= 24;
    cout << (hour >= 10 ? "" : "0") << hour << ":" << (minute >= 10 ? "" : "0") << minute;
    return 0;
}
