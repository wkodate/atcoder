package com.wkodate.atcoder.arc031.b;

import java.util.Scanner;

public class Main {

    private static void dfs(String[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || "x".equals(grid[i][j])) {
            return;
        }
        grid[i][j] = "x";
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] s = new String[10][10];
        for (int i = 0; i < 10; i++) {
            s[i] = sc.next().split("");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String[][] grid = new String[10][10];
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        grid[k][l] = s[k][l];
                    }
                }
                grid[i][j] = "o";
                dfs(grid, i, j);
                boolean island = true;
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        if ("o".equals(grid[k][l])) {
                            island = false;
                            break;
                        }
                    }
                }
                if (island) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

}
