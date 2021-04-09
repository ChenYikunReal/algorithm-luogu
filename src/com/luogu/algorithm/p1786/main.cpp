#include <iostream>
#include <algorithm>

using namespace std;

struct Person {
    // 姓名
    string name;
    // 原身份
    string origin_status;
    // 现身份
    string now_status;
    // 等级
    int rank;
    // 帮贡
    int contribution;
    // 输入序号
    int id;
} person[111];

int change(string str){
    if (str == "BangZhu") {
        return 0;
    } else if (str == "FuBangZhu") {
        return 1;
    } else if (str == "HuFa") {
        return 2;
    } else if (str == "ZhangLao") {
        return 3;
    } else if (str == "TangZhu") {
        return 4;
    } else if (str == "JingYing") {
        return 5;
    }
    return 6;
}

int cmp1(Person p1, Person p2) {
    if (p1.contribution == p2.contribution) {
        return p1.id < p2.id;
    }
    return p1.contribution > p2.contribution;
}

int cmp2(Person p1, Person p2) {
    if (change(p1.now_status) == change(p2.now_status)) {
        if (p1.rank == p2.rank) {
            return p1.id < p2.id;
        }
        return p1.rank > p2.rank;
    }
    return change(p1.now_status) < change(p2.now_status);
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> person[i].name >> person[i].origin_status >> person[i].contribution >> person[i].rank;
        person[i].id = i;
    }
    sort(person+3, person+n, cmp1);
    for (int i = 0; i < n; i++){
        if (i == 0) {
            person[i].now_status = "BangZhu";
        } else if (i == 1 || i == 2) {
            person[i].now_status = "FuBangZhu";
        } else if (i == 3 || i == 4) {
            person[i].now_status = "HuFa";
        } else if (i >= 5 && i <= 8) {
            person[i].now_status = "ZhangLao";
        } else if (i >= 9 && i <= 15) {
            person[i].now_status = "TangZhu";
        } else if (i >= 16 && i <= 40) {
            person[i].now_status = "JingYing";
        } else {
            person[i].now_status = "BangZhong";
        }
    }
    sort(person, person+n, cmp2);
    for (int i = 0; i < n; i++) {
        cout << person[i].name << " " << person[i].now_status << " " << person[i].rank << endl;
    }
    return 0;
}
