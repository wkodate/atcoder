package com.wkodate.atcoder.arc002.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        char[] commands = { 'A', 'B', 'X', 'Y' };
        int ans = c.length;
        for (int l1 = 0; l1 < commands.length; l1++) {
            for (int l2 = 0; l2 < commands.length; l2++) {
                for (int r1 = 0; r1 < commands.length; r1++) {
                    for (int r2 = 0; r2 < commands.length; r2++) {
                        if (l1 == r1 && l2 == r2) {
                            continue;
                        }
                        char[] l = { commands[l1], commands[l2] };
                        char[] r = { commands[r1], commands[r2] };
                        int cnt = 0;
                        for (int i = 0; i < n - 1; i++) {
                            if (c[i] == l[0] && c[i + 1] == l[1]
                                || c[i] == r[0] && c[i + 1] == r[1]) {
                                cnt++;
                                i++;
                            }
                        }
                        ans = Math.min(ans, cnt + c.length - 2 * cnt);
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
