#include <iostream>
#include <stack>

using namespace std;

stack<int> expression;

// AC
int main() {
    int a, b, m = 10000;
    char c;
    cin >> a;
    expression.push(a % m);
    while (cin >> c >> b) {
        if (c == '*') { // × 取出运算再压栈
            a = expression.top();
            expression.pop();
            expression.push(a * b % m);
        } else {    // + 压栈
            expression.push(b);
        }
    }
    a = 0;
    while(expression.size()) {
        a += expression.top();
        a %= m;
        expression.pop();
    }
    cout << a;
    return 0;
}
