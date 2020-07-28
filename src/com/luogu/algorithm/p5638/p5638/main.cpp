#include<bits/stdc++.h>
using namespace std;

long long sum_array[1000001];
long long num, radius;

int main() {
    cin >> num >> radius;
    for(int i = 0; i < num-1; i++) {
        long long x;
        cin>>x;
        sum_array[i+1] = sum_array[i] + x;
    }
    long long count = sum_array[radius];
    for(int i = 1; i < num - radius; i++) {
        count=max(count, sum_array[i + radius] - sum_array[i]);
    }
    cout << sum_array[num-1]-count << endl;
    return 0;
}