package com.wkodate.atcoder.abc039.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }
        char[][] original = new char[h][w];
        char[][] processed = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                original[i][j] = '.';
                processed[i][j] = '.';
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '.') {
                    continue;
                }
                boolean org = true;
                for (int ud = -1; ud <= 1; ud++) {
                    for (int lr = -1; lr <= 1; lr++) {
                        if (ud == 0 && lr == 0) {
                            continue;
                        }
                        int x = i + ud;
                        int y = j + lr;
                        if (x >= 0 && x < h && y >= 0 && y < w
                            && s[x][y] == '.') {
                            org = false;
                            break;
                        }
                    }
                    if (!org) {
                        break;
                    }
                }
                if (org) {
                    original[i][j] = '#';
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (original[i][j] == '.') {
                    continue;
                }
                for (int ud = -1; ud <= 1; ud++) {
                    for (int lr = -1; lr <= 1; lr++) {
                        int x = i + ud;
                        int y = j + lr;
                        if (x >= 0 && x < h && y >= 0 && y < w) {
                            processed[x][y] = '#';
                        }
                    }
                }
            }
        }
        boolean possible = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] != processed[i][j]) {
                    possible = false;
                    break;
                }
            }
        }
        if (!possible) {
            System.out.println("impossible");
            return;
        }
        System.out.println("possible");
        for (int i = 0; i < h; i++) {
            System.out.println(new String(original[i]));
        }
    }

}
