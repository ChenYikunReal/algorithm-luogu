#include<cstdio>

long double result, temp;

int main() {
    while((scanf("%Lf",&temp)) != EOF) {
        result += temp * 1000000;
    }
    printf("%.5Lf", result / 1000000);
    return 0;
}