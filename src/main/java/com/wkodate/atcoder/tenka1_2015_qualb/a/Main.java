package com.wkodate.atcoder.tenka1_2015_qualb.a;

public class Main {

    public static void main(String[] args) {
        int[] ans = new int[20];
        ans[0] = 100;
        ans[1] = 100;
        ans[2] = 200;
        for (int i = 3; i < 20; i++) {
            ans[i] = ans[i - 1] + ans[i - 2] + ans[i - 3];
        }
        System.out.println(ans[19]);
    }

}
