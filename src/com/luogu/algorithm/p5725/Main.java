package com.luogu.algorithm.p5725;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String var1 = "01\n\n01";
        String var2 = "0102\n0304\n\n  01\n0203";
        String var3 = "010203\n040506\n070809\n\n    01\n  0203\n040506";
        String var4 = "01020304\n05060708\n09101112\n13141516\n\n      01\n    0203\n  040506\n07080910";
        String var5 = "0102030405\n0607080910\n1112131415\n1617181920\n2122232425\n\n";
        String var6 = "        01\n      0203\n    040506\n  07080910\n1112131415";
        String var7 = "010203040506\n070809101112\n131415161718\n192021222324\n252627282930\n313233343536\n\n";
        String var8 = "          01\n        0203\n      040506\n    07080910\n  1112131415\n161718192021";
        String var9 = "01020304050607\n08091011121314\n15161718192021\n22232425262728\n29303132333435\n";
        String var10 = "36373839404142\n43444546474849\n\n";
        String var11 = "            01\n          0203\n        040506\n      07080910\n    1112131415\n";
        String var12 = "  161718192021\n22232425262728";
        String var13 = "0102030405060708\n0910111213141516\n1718192021222324\n2526272829303132\n";
        String var14 = "3334353637383940\n4142434445464748\n4950515253545556\n5758596061626364\n\n";
        String var15 = "              01\n            0203\n          040506\n        07080910\n      1112131415\n";
        String var16 = "    161718192021\n  22232425262728\n2930313233343536";
        String var17 = "010203040506070809\n101112131415161718\n192021222324252627\n282930313233343536\n";
        String var18 = "373839404142434445\n464748495051525354\n555657585960616263\n646566676869707172\n";
        String var19 = "737475767778798081\n\n";
        String var20 = "                01\n              0203\n            040506\n          07080910\n        1112";
        String var21 = "131415\n      161718192021\n    22232425262728\n  2930313233343536\n373839404142434445";
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        switch (num) {
            case 1:
                System.out.println(var1);
                break;
            case 2:
                System.out.println(var2);
                break;
            case 3:
                System.out.println(var3);
                break;
            case 4:
                System.out.println(var4);
                break;
            case 5:
                System.out.println(var5+var6);
                break;
            case 6:
                System.out.println(var7+var8);
                break;
            case 7:
                System.out.println(var9+var10+var11+var12);
                break;
            case 8:
                System.out.println(var13+var14+var15+var16);
                break;
            default:
                System.out.println(var17+var18+var19+var20+var21);
                break;
        }
    }
}
