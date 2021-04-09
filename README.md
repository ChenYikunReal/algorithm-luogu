# 洛谷算法题集训(Java/C++语言描述)

![](images/luogu.jpg)

## 洛谷算法题的结果
![](https://img-blog.csdnimg.cn/2019122312234712.PNG) <br/>
下面的解释纯属娱乐：
- AC=Answer Coarse=粗劣的答案
- WA=Wonderful Answer=好答案
- TLE=Time Limit Enough=时间充裕
- MLE=Memory Limit Enough=内存充裕
- CE=Compile Easily=轻松通过编译
- RE=Run Excellently=完美运行
- UKE=Unbelievably Keep Enough Score=难以置信地保持足够的分数
- AU=All Unaccepted=全都不正确

下面才是正解：
- AC：Accept，程序通过。
- CE：Compile Error，编译错误。
- PC：Partially Correct，部分正确。
- WA：Wrong Answer，答案错误。
- RE：Runtime Error，运行时错误。
- TLE：Time Limit Exceeded，超出时间限制。
- MLE：Memory Limit Exceeded，超出内存限制。
- OLE：Output Limit Exceeded，输出超过限制。
- UKE：Unknown Error，出现未知错误。

![](/images/result.jpg)

## 题解锦集
- [红题](https://blog.csdn.net/weixin_43896318/article/details/104156713)
- [试炼场の新手村](https://blog.csdn.net/weixin_43896318/article/details/104114493)
- [顺序结构](https://blog.csdn.net/weixin_43896318/article/details/105884399)
- [分支结构](https://blog.csdn.net/weixin_43896318/article/details/105884713)
- [循环结构](https://blog.csdn.net/weixin_43896318/article/details/105885191)
- [字符串](https://blog.csdn.net/weixin_43896318/article/details/105885512)
- [数组](https://blog.csdn.net/weixin_43896318/article/details/105885470)
- [函数与结构体](https://blankspace.blog.csdn.net/article/details/115422133)
- [排序](https://blog.csdn.net/weixin_43896318/article/details/105883185)
- [暴力枚举](https://blankspace.blog.csdn.net/article/details/115422150)


## 任务日志(From 2020.04.03)
- [x] `[2020-07-28]` 咕咕咕 久违的洛谷啊 我回来了！
- [x] `[2020-10-26]` 咕咕咕 为了蓝桥杯争国二 愿我谷保佑我！
- [x] `[2021-04-03]` 咕咕咕 为了蓝桥杯省赛 我又来了 最近还在改C++ 还没完全熟悉STL 仍然是橙题和黄题 呜呜呜！啥时候能做到绿题蓝题啊！
- [x] `[2021-04-09]` 哇咔咔 第一次做出绿题 菜鸡泪奔 接下来可能就是黄题和绿题的时代了 乌拉！

## Git相关问题的处理
我的Git与Github严重不同步，出了某些问题，比较难处理。最终决定先清再补：
1. 把Github项目clone到本地某路径下
2. 清空目录下除.git以外的所有内容
3. 更新本地Git并提交“空”内容到Github
4. 将此时的新.git文件夹换掉原先本地项目中的.git文件夹
5. 本地原项目处正常提交修改

遗憾的是当时没有考虑到`.gitignore`的问题，`.idea`和`out`目录还在，此时补`.gitignore`已然无效，必须如下处理：
```shell
git rm -r --cached .
git add .
git commit -m "注释"
git push -u origin master
```

注意：
不要误解了`.gitignore`文件的用途，该文件只能作用于`Untracked Files`，也就是那些从来没有被Git记录过的文件(自添加以后，从未add及commit过的文件)。<br/>
如果文件曾经被Git记录过，那么`.gitignore`就对它们完全无效。

## 开启文件读写的方法
C++可以将文件放在路径下后，使用如下语句读文件：
```cpp
int n;
ifstream infile;
infile.open("P1873_2.in");
infile >> n;
```

## 优化cin至scanf()性能
```cpp
ios::sync_with_stdio(false);
```
慎用！
