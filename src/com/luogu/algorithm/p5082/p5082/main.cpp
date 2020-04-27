#include <cstdio>
using namespace std;

double num, sum = 0, getSum = 0;

int main() {
    scanf("%lf", &num);
    for(int i = 0; i < num; i++) {
        double temp;
        scanf("%lf", &temp);
        sum += temp;
    }
    for(int i = 0; i < num; i++) {
        double temp;
        scanf("%lf", &temp);
        getSum += temp;
    }
    printf("%.6lf\n", (3*sum - 2*getSum) / (sum-getSum));
    return 0;
}
