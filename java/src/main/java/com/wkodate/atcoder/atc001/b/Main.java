package com.wkodate.atcoder.atc001.b;

import java.util.Scanner;

public class Main {

    static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        private int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = root(parent[x]);
        }

        private void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) {
                return;
            }
            parent[rx] = ry;
        }

        private boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] p = new int[q];
        int[] a = new int[q];
        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            p[i] = sc.nextInt();
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < q; i++) {
            if (p[i] == 0) {
                uf.unite(a[i], b[i]);
            } else {
                if (uf.same(a[i], b[i])) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

}
