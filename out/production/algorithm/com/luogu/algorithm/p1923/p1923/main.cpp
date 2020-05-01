#include<bits/stdc++.h>

using namespace std;

long long num, k, nums[5000010];

int main() {
    scanf("%d%d", &num, &k);
    for(int i=0; i < num; i++) {
        scanf("%d", &nums[i]);
    }
    nth_element(nums, nums + k, nums + num);
    printf("%d", nums[k]);
}