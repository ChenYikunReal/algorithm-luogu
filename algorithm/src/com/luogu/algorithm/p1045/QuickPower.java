package com.luogu.algorithm.p1045;

import java.math.BigInteger;
import java.util.Scanner;

public class QuickPower {

    private static long pow1(int a, int b) {
        long result = 1;
        while (b > 0) {
            b--;
            result *= a;
        }
        return result;
    }

    private static long pow2(int a, int b) {
        long result = 1, base = a;
        while(b > 0) {
            if(b % 2 != 0) {
                result *= base;
            }
            base *= base;
            b /= 2;
        }
        return result;
    }

    private static long recursivePow(int a, int b) {
        if(b == 1) {
            return a;
        }
        long temp = recursivePow(a,b/2);
        return (b % 2 == 0 ? 1 : a) * temp * temp;
    }

    private static long pow3(int a, int b) {
        if(b == 0) {
            return 1;
        }
        while((b & 1) == 0) {
            b >>= 1;
            a *= a;
        }
        long result = a;
        b >>= 1;
        while(b > 0){
            a *= a;
            if((b & 1) != 0) {
                result *= a;
            }
            b >>= 1;
        }
        return result;
    }

    private static long quickPower(long a, long b) {
        long result = 1, temp = a;
        while(b > 0) {
            if((b & 1) != 0) {
                result *= temp;
            }
            temp *= temp;
            b >>= 1;
        }
        return result;
    }

    private static long quick(int a,int b,int c) {
        long result = 1;   //结果的保存，就是An，初始化一下
        long temp = a % c;     //首先计算T0的值，用于Tn的递推
        while(b != 0) {
            //这个if是判断目前最右边的一位bn是不是1，如果是1，那么Kn=Tn直接用Tn递推，具体看上面原理，如果bn=0,那么Kn=1,
            // 考虑到An-1是小于c的，所以 An=（An-1）%c =An-1 就是说可以不用计算了 因为相当于直接 A=A
            if((b & 1) != 0) {
                result = ( result * temp ) % c;
            }
            b >>= 1;       //二进制位移，相当于从右到左读取位b0 b1 b2 b3 b4等等
            temp = (temp * temp) % c;   //更新T，如果下一位是1就可以用这个算A，具体的可以看上面原理的递推关系
        }
        return result;
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println(quickPower(scanner.nextInt(), scanner.nextInt()));
        //System.out.println(quick(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        //scanner.close();
        System.out.println(new BigInteger("5").pow(3));
        System.out.println((int)Math.pow(5, 3));
        System.out.println(Math.pow(5, 3));
        int[] array = new int[] {1, 2, };
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(0x2.0p-3);
    }

}
