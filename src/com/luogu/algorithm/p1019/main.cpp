#include <iostream>
#include <string>

#define N 100

using namespace std;

int n;
int ans = 0;
string word[N]; // 记录输入的单词
string begin_n; // 记录开头字符
int used[N]; // 记录每个单词被使用的次数

/**
 * 判断接口可行性
 * @param s
 * @param m
 * @param k 接口长度
 * @return
 */
bool check(string s, string m, int k) {
    int len_s = s.length();
    for (int i = 0; i < k; i++){
        if (s[len_s-k+i] != m[i]) {
            return false;
        }
    }
    return true;
}

/**
 * 拼接字符串，不能传参因为还要回溯
 * @param s
 * @param m
 * @param k
 */
void add(string &s, string m, int k) {
    int len_m = m.length();
    for (int i = k; i < len_m; i++) {
        // C++支持直接+=
        s += m[i];
    }
}

void dfs(string now) {
    int x = now.length();
    // 每次拼接之后更新一下答案
    ans = max(ans, x);
    for (int i = 0; i < n; i++) {
        // 不能用一个单词超过两次
        if (used[i] >= 2) {
            continue;
        }
        int max_k = word[i].length();
        for (int j = 1; j <= max_k; j++) {
            if (check(now, word[i], j)) {
                // 使用字符串的副本进行拼接
                string temp = now;
                add(temp, word[i], j);
                // 如果拼接后长度没增加，则剪枝
                if (temp == now) {
                    continue;
                }
                used[i]++;
                dfs(temp);
                // 回溯
                used[i]--;
            }
        }
    }

}

int main(){
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> word[i];
    }
    cin >> begin_n;
    dfs(begin_n);
    cout << ans << endl;
    return 0;
}
