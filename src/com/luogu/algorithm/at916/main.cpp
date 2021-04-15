#include <iostream>
#include <queue>

using namespace std;

struct node {
    int data, counter = 0;
} temp_node;

queue<node> nums;

bool flag[301];

int sub_nums[3] = {1, 2, 3};

int main() {
    int n, ng1, ng2, ng3;
    cin >> n >> ng1 >> ng2 >> ng3;
    temp_node.data = n;
    nums.push(temp_node);
    if (n > 300 || n == ng1 || n == ng2 || n == ng3) {
        cout << "NO" << endl;
        return 0;
    }
    // BFS
    while (!nums.empty()) {
        temp_node = nums.front();
        if (temp_node.counter > 100) {
            break;
        } else if (temp_node.data == 0) {
            cout << "YES" << endl;
            return 0;
        }
        for (int i = 0; i < 3; i++) {
            temp_node = nums.front();
            temp_node.data -= sub_nums[i];
            temp_node.counter++;
            if (temp_node.data >= 0 && temp_node.data != ng1 && temp_node.data != ng2 && temp_node.data != ng3 && !flag[temp_node.data]) {
                nums.push(temp_node);
                flag[temp_node.data] = true;
            }
        }
        nums.pop();
    }
    cout << "NO" << endl;
    return 0;
}
