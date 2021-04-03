#include <iostream>
#include <deque>

using namespace std;

int nums[4000001];

// O(N)
int main() {
    // 不初始化的都是SandBox
    int n, m, left_result = 0, right_result = 0, sum_result = 0, left = 1, sum = 0;
    cin >> n >> m;
    // 题意下标从1开始
    for (int i = 1; i <= n; i++) {
        cin >> nums[i];
    }
    // 双端队列当队列用
    deque<int> queue;
    // right指针和left指针就是要维护的区间
    for (int right = 1; right <= n; right++) {
        // 逐一入队
        queue.push_back(nums[right]);
        sum += nums[right];
        // 如果溢出m则进行出队处理，有可能需要出好几个，所以需要循环结构而不是选择结构
        while (sum > m) {
            // 出队
            queue.pop_front();
            // 溢出了表示可以更新答案，但更新前需要去掉这个溢出值
            sum -= nums[right];
            // 更新答案
            if (sum > sum_result) {
                sum_result = sum;
                // 减去1是因为当前不能要，应该取上一个
                right_result = right - 1;
                left_result = left;
            }
            // 重新加上，不然就错过了
            sum += nums[right];
            // 删去左端点
            sum -= nums[left];
            // 出队后左端点右移一位
            left++;
        }
    }
    // 不加末尾特判的话，会忽略最后一次，会WA
    // 测试样例：
    // 10 50
    // 2 2 1 9 7 8 8 3 9 5
    // 输出：
    // 3 10 50
    if (sum > sum_result) {
        sum_result = sum;
        right_result = n;
        left_result = left;
    }
    cout << left_result << " " << right_result << " " << sum_result;
    return 0;
}
