#include<cstdio>

int seq[2000001];

int main() {
    int n, m, sum;
    scanf("%d %d", &n, &m);
    for(int i=1; i<=n; i++) {
        scanf("%d", &seq[i]);
    }
    for(int i=1; i<=m; i++) {
        scanf("%d", &sum);
        printf("%d\n", seq[sum]);
    }
}