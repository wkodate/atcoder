package com.wkodate.atcoder.abc007.c;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    private static Deque<Point> queue = new ArrayDeque<>();
    private static String[][] squares;
    private static boolean[][] pushed;

    static class Point {
        int y;
        int x;
        int depth;

        Point(int y, int x, int depth) {
            this.y = y;
            this.x = x;
            this.depth = depth;
        }
    }

    private static void search(int y, int x, int depth) {
        if (!pushed[y - 1][x] && ".".equals(squares[y - 1][x])) {
            queue.addLast(new Point(y - 1, x, depth + 1));
            pushed[y - 1][x] = true;
        }
        if (!pushed[y + 1][x] && ".".equals(squares[y + 1][x])) {
            queue.addLast(new Point(y + 1, x, depth + 1));
            pushed[y + 1][x] = true;
        }
        if (!pushed[y][x - 1] && ".".equals(squares[y][x - 1])) {
            queue.addLast(new Point(y, x - 1, depth + 1));
            pushed[y][x - 1] = true;
        }
        if (!pushed[y][x + 1] && ".".equals(squares[y][x + 1])) {
            queue.addLast(new Point(y, x + 1, depth + 1));
            pushed[y][x + 1] = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        int gy = sc.nextInt();
        int gx = sc.nextInt();
        squares = new String[r][c];
        pushed = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            squares[i] = sc.next().split("");
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                pushed[i][j] = false;
            }
        }

        queue.addLast(new Point(sy - 1, sx - 1, 0));
        int result = 0;
        while (true) {
            Point point = queue.pop();
            if (point.y == gy - 1 && point.x == gx - 1) {
                result = point.depth;
                break;
            }
            search(point.y, point.x, point.depth);
        }
        System.out.println(result);
    }

}
