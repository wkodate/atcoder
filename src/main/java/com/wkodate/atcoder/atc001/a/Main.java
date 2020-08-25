package com.wkodate.atcoder.atc001.a;

import java.util.Scanner;

public class Main {

    private static boolean dfs(char[][] grid, int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length
            || grid[x][y] == 's' || grid[x][y] == '#' || visited[x][y]) {
            return false;
        }
        if (grid[x][y] == 'g') {
            return true;
        }
        visited[x][y] = true;
        return dfs(grid, x + 1, y, visited) || dfs(grid, x - 1, y, visited)
               || dfs(grid, x, y + 1, visited) || dfs(grid, x, y - 1, visited);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        int sx = 0;
        int sy = 0;
        for (int i = 0; i < h; i++) {
            c[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (c[i][j] == 's') {
                    sx = i;
                    sy = j;
                }
            }
        }
        boolean[][] visited = new boolean[h][w];
        if (dfs(c, sx + 1, sy, visited) || dfs(c, sx - 1, sy, visited)
            || dfs(c, sx, sy + 1, visited) || dfs(c, sx, sy - 1, visited)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
