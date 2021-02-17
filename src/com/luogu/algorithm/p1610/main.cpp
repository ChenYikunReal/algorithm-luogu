#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, dist, count = 0;
    cin >> n >> dist;
    int lights[n];
    for (int i = 0; i < n; i++) {
        cin >> lights[i];
    }
    sort(lights, lights+n);
    for (int i = 1; i < n-1; i++) {
        if (lights[i+1]-lights[i-1] <= dist) {
            lights[i] = lights[i-1];
            count++;
        }
    }
    cout << count << endl;
    return 0;
}
