package com.luogu.algorithm.p1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        char[][] chars = new char[num][num];
        byte[][] flags = new byte[num][num];
        //初始化
        for (int i = 0; i < num; i++) {
            char[] temp = reader.readLine().toCharArray();
            for (int j = 0; j < num; j++) {
                chars[i][j] = temp[j];
            }
        }
        reader.close();
        if (num < 7) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < num; i++) {
                result.append('*');
            }
            //洛谷不识别下面的代码
            //String result = "*";
            //result = result.repeat(num);
            for (int i = 0; i < num; i++) {
                System.out.println(result);
            }
            return;
        }
        //水平方向
        for (int i = 0; i < num; i++) {
            StringBuilder temp = new StringBuilder(), temp2;
            for (int j = 0; j < num; j++) {
                temp.append(chars[i][j]);
            }
            temp2 = temp;
            int index = temp.indexOf("yizhong");
            while (index >= 0) {
                for (int j = index; j < index+7; j++) {
                    if (flags[i][j] == 0) {
                        flags[i][j] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp.indexOf("yizhong");
            }
            index = temp2.indexOf("gnohziy");
            while (index >= 0) {
                for (int j = index; j < index+7; j++) {
                    if (flags[i][j] == 0) {
                        flags[i][j] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp2.indexOf("gnohziy");
            }
        }
        //竖直方向
        for (int j = 0; j < num; j++) {
            StringBuilder temp = new StringBuilder(), temp2;
            for (int i = 0; i < num; i++) {
                temp.append(chars[i][j]);
            }
            temp2 = temp;
            int index = temp.indexOf("yizhong");
            while (index >= 0) {
                for (int i = index; i < index+7; i++) {
                    if (flags[i][j] == 0) {
                        flags[i][j] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp.indexOf("yizhong");
            }
            index = temp2.indexOf("gnohziy");
            while (index >= 0) {
                for (int i = index; i < index+7; i++) {
                    if (flags[i][j] == 0) {
                        flags[i][j] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp2.indexOf("gnohziy");
            }
        }
        //主对角线方向
        //下方扫描
        for (int i = 0; i < num-7; i++) {
            StringBuilder temp = new StringBuilder(), temp2;
            int x = i, y = 0;
            while (x < num) {
                temp.append(chars[x++][y++]);
            }
            temp2 = temp;
            int index = temp.indexOf("yizhong");
            while (index >= 0) {
                for (int j = i+index, k = index; k < index+7; j++, k++) {
                    if (flags[j][k] == 0) {
                        flags[j][k] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp.indexOf("yizhong");
            }
            index = temp2.indexOf("gnohziy");
            while (index >= 0) {
                for (int j = i+index, k = index; k < index+7; j++, k++) {
                    if (flags[j][k] == 0) {
                        flags[j][k] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp2.indexOf("gnohziy");
            }
        }
        //主对角线方向
        //右侧扫描
        for (int i = 0; i < num-7; i++) {
            StringBuilder temp = new StringBuilder(), temp2;
            int x = 0, y = i;
            while (y < num) {
                temp.append(chars[x++][y++]);
            }
            temp2 = temp;
            int index = temp.indexOf("yizhong");
            while (index >= 0) {
                for (int j = i+index, k = index; k < index+7; j++, k++) {
                    if (flags[k][j] == 0) {
                        flags[k][j] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp.indexOf("yizhong");
            }
            index = temp2.indexOf("gnohziy");
            while (index >= 0) {
                for (int j = i+index, k = index; k < index+7; j++, k++) {
                    if (flags[k][j] == 0) {
                        flags[k][j] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp2.indexOf("gnohziy");
            }
        }
        //次对角线方向
        //下方扫描
        for (int i = 0; i < num-6; i++) {
            StringBuilder temp = new StringBuilder(), temp2;
            int x = i, y = num-1;
            while (x < num) {
                temp.append(chars[x++][y--]);
            }
            temp2 = temp;
            int index = temp.indexOf("yizhong");
            while (index >= 0) {
                for (int j = i+index, k = num-index-1; j < i+index+7; j++, k--) {
                    if (flags[j][k] == 0) {
                        flags[j][k] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp.indexOf("yizhong");
            }
            index = temp2.indexOf("gnohziy");
            while (index >= 0) {
                for (int j = i+index, k = num-index-1; j < i+index+7; j++, k--) {
                    if (flags[j][k] == 0) {
                        flags[j][k] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp2.indexOf("gnohziy");
            }
        }
        //次对角线方向
        //左侧扫描
        for (int i = num-1; i > 5; i--) {
            StringBuilder temp = new StringBuilder(), temp2;
            int x = 0, y = i;
            while (y > 0) {
                temp.append(chars[x++][y--]);
            }
            temp2 = temp;
            int index = temp.indexOf("yizhong");
            while (index >= 0) {
                for (int j = index, k = i-index; j < index+7; j++, k--) {
                    if (flags[j][k] == 0) {
                        flags[j][k] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp.indexOf("yizhong");
            }
            index = temp2.indexOf("gnohziy");
            while (index >= 0) {
                for (int j = index, k = i-index; j < index+7; j++, k--) {
                    if (flags[j][k] == 0) {
                        flags[j][k] = 1;
                    }
                }
                temp.replace(index, index+7, "zzzzzzz");
                index = temp2.indexOf("gnohziy");
            }
        }
        //打印结果
        for (int i = 0; i < num; i++) {
            StringBuilder result = new StringBuilder();
            int j;
            for (j = 0; j < num; j++) {
                if (flags[i][j] == 0) {
                    result.append('*');
                } else {
                    result.append(chars[i][j]);
                }
            }
            System.out.println(result);
        }
    }
}
