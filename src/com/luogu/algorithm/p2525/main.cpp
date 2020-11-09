#include<bits/stdc++.h>

using namespace std;

int num, a[10];

int main() {
    cin >> num;
    for(int i=0; i < num; i++) {
        cin>>a[i];
    }
    if(prev_permutation(a, a + num)) {
        for(int i=0; i < num; i++) {
            cout<<a[i]<<" ";
        }
    } else {
        cout<<"ERROR";
    }
    cout<<endl;
    return 0;
}
