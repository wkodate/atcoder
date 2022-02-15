package com.wkodate.atcoder.joi2011yo.e;

import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        char[][] c = new char[h][w];
        int[][] npos = new int[n + 1][2];
        Deque<Point> queue = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            c[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (c[i][j] == 'S') {
                    queue.add(new Point(i, j));
                } else if (c[i][j] == '.' || c[i][j] == 'X') {
                    continue;
                } else {
                    npos[c[i][j] - '0'][0] = i;
                    npos[c[i][j] - '0'][1] = j;
                }
            }
        }
        final int[][] DXDY = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        int cnt = 0;
        int target = 1;
        boolean[][] visited = new boolean[h][w];
        while (!queue.isEmpty() && target <= n) {
            int size = queue.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                Point p = queue.poll();
                int posx = p.x;
                int posy = p.y;
                for (int j = 0; j < DXDY.length; j++) {
                    int x = posx + DXDY[j][0];
                    int y = posy + DXDY[j][1];
                    if (x < 0 || x >= h || y < 0 || y >= w || c[x][y] == 'X' || visited[x][y]) {
                        continue;
                    }
                    if (c[x][y] - '0' == target) {
                        queue.clear();
                        queue.add(new Point(x, y));
                        target++;
                        visited = new boolean[h][w];
                        visited[x][y] = true;
                        i = size;
                        break;
                    }
                    visited[x][y] = true;
                    queue.add(new Point(x, y));
                }
            }
        }
        System.out.println(cnt);
    }
}
