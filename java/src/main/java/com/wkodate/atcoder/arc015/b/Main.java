package com.wkodate.atcoder.arc015.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[6];
        for (int i = 0; i < n; i++) {
            double maxT = sc.nextDouble();
            double minT = sc.nextDouble();
            if (maxT >= 35) {
                ans[0]++;
            } else if (maxT >= 30) {
                ans[1]++;
            } else if (maxT >= 25) {
                ans[2]++;
            } else if (maxT < 0) {
                ans[5]++;
            }
            if (minT >= 25) {
                ans[3]++;
            } else if (maxT >= 0 && minT < 0) {
                ans[4]++;
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < ans.length; i++) {
            sj.add(String.valueOf(ans[i]));
        }
        System.out.println(sj.toString());
    }

}
