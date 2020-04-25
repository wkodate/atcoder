package com.wkodate.atcoder;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

public class Utils {

    /**
     * 最大公約数.
     */
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * 最小公倍数.
     */
    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    /**
     * 素数判定.
     */
    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 桁和.
     */
    private static int digsum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * 約数全列挙.
     */
    private static List<Integer> divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            if (n % i != 0) {
                continue;
            }
            list.add(i);
            if (i != 1 && i * i != n) {
                list.add(n / i);
            }
        }
        return list;
    }

    /**
     * 素因数分解.
     */
    private static List<Long> primeFactors(long n) {
        List<Long> list = new ArrayList<>();
        while (n % 2 == 0) {
            list.add(2L);
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            list.add(n);
        }
        return list;
    }

    /**
     * next permutation.次の順列.
     */
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 順列一覧(重複あり)
     */
    private static void printPermutation(String str, String word) {
        if (word.length() == str.length()) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            printPermutation(str, word + str.charAt(i));
        }
    }

    public static void permute(String str) {
        printPermutation(str, "");
    }

    /**
     * factorial 階乗
     */
    public static long factorial(long n) {
        final long MOD = 1_000_000_007;
        long ans = 1;
        for (long i = 2; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        return ans;
    }

    /**
     * 二分探索。めぐる式
     */
    public static int binarySearch(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        int mid;
        while (right - left > 1) {
            mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    /**
     * 三角形の面積.
     */
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * しゃくとり法。区間計算.
     * k以上を満たす範囲の組み合わせの数.
     */
    public static long twoPointers(int[] a, int k) {
        long ans = 0;
        int right = 0;
        long sum = 0;
        for (int left = 0; left < a.length; left++) {
            while (right < a.length && sum < k) {
                sum += a[right++];
            }
            if (sum < k) {
                break;
            }
            ans += a.length - right + 1;
            if (right == left) {
                right++;
            } else {
                sum -= a[left];
            }
        }
        return ans;
    }

    /**
     * 2次元配列のソート.
     */
    public static void twoDArraySort(long[][] arr) {
        Arrays.sort(arr, Comparator.comparingLong(a -> a[0]));
        // reversed
        Arrays.sort(arr, Comparator.comparingLong((long[] a) -> a[0]).reversed());
    }

    /**
     * bit全探索. 部分集合を全列挙.
     */
    public static void bitSearch() {
        int[] abc = new int[]{0, 1, 2};
        int n = abc.length;
        // 2^n通り
        for (int bit = 0; bit < (1 << n); bit++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) == 1) {
                    // trueのときの処理
                    sb.append(abc[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * 幅優先探索.
     * s[][]のgridを(0,0)から(w,h)に向かってその深さを求める例.
     */
    public static void bfs(String[][] s, int h, int w) {
        final int[][] DXDY = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        Deque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(0, 0));
        int depth = 1;
        boolean[][] visited = new boolean[h][w];
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                Point p = queue.poll();
                int posx = p.x;
                int posy = p.y;
                for (int j = 0; j < DXDY.length; j++) {
                    int x = posx + DXDY[j][0];
                    int y = posy + DXDY[j][1];
                    if (x == h - 1 && y == w - 1) {
                        System.out.println(depth);
                        return;
                    }
                    if (x < 0 || x >= s.length || y < 0 || y >= s[0].length || "#".equals(s[x][y])
                            || visited[x][y]) {
                        continue;
                    }
                    visited[x][y] = true;
                    queue.add(new Point(x, y));
                }
            }
        }
    }

    /**
     * 逆元.累乗計算
     * a/b ≡ a×(1/b)(mod p) の1/bが逆元.
     * フェルマーの小定理,a*a^(m-2)≡1(mod m).
     * long ans = a * modpow(b, MOD - 2, MOD) % MOD;
     */
    public static long modpow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return modpow(a * a % mod, b / 2, mod);
        }
        return a * modpow(a, b - 1, mod) % mod;
    }

    /**
     * 二項定理.
     * nCkInit();
     * nCk(n,k);
     */
    private static final int MOD = 1000000007;
    private static long[] fac = new long[510000];
    private static long[] finv = new long[510000];
    private static long[] inv = new long[510000];

    public static void nCkInit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 510000; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[(MOD % i)] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    public static long nCk(int n, int k) {
        if (n < k) {
            return 0;
        }
        if (n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    /**
     * UnionFind. グループ分けを木構造で管理.
     */
    static class UnionFind {
        // 親の番号.
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        // xが属する木の根を再帰で得る.
        private int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = root(parent[x]);
        }

        // 木を結合.
        private void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) {
                return;
            }
            parent[rx] = ry;
        }

        // 2つの木が同じかどうか.
        private boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }
    }

    public static void main(String[] args) {
    }

}
