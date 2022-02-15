package com.wkodate.atcoder.arc005.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String w = sc.next();
        char[][] c = new char[9][9];
        for (int i = 0; i < 9; i++) {
            c[i] = sc.next().toCharArray();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c[y - 1][x - 1]);
        char[] wc = w.toCharArray();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < wc.length; j++) {
                if (wc[j] == 'R') {
                    x++;
                    if (x >= 10) {
                        x -= 2;
                        wc[j] = 'L';
                    }
                } else if (wc[j] == 'L') {
                    x--;
                    if (x <= 0) {
                        x += 2;
                        wc[j] = 'R';
                    }
                } else if (wc[j] == 'U') {
                    y--;
                    if (y <= 0) {
                        y += 2;
                        wc[j] = 'D';
                    }
                } else if (wc[j] == 'D') {
                    y++;
                    if (y >= 10) {
                        y -= 2;
                        wc[j] = 'U';
                    }
                }
            }
            sb.append(c[y - 1][x - 1]);
        }
        System.out.println(sb);
    }

}
