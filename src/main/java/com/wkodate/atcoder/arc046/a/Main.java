package com.wkodate.atcoder.arc046.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[51];
        for (int i = 1; i <= n; i++) {
            for (int j = ans[i - 1] + 1; j <= 555555; j++) {
                String[] s = String.valueOf(j).split("");
                boolean same = true;
                for (int k = 0; k < s.length; k++) {
                    if (!s[0].equals(s[k])) {
                        same = false;
                        break;
                    }
                }
                if (same) {
                    ans[i] = j;
                    break;
                }
            }
        }
        System.out.println(ans[n]);
    }

}
