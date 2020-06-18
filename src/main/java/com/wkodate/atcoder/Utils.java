package com.wkodate.atcoder;

import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

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
    private static List<Long> divisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i < n; i++) {
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
     * Longest Common Subsequence(LCS).
     * 最長共通部分列.
     */
    private static long longestCommonSubsequence(String str1, String str2) {
        long[][] dp = new long[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }

    /**
     * 最大部分配列.
     */
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    /**
     * 和がkになる部分配列の和を見つける.
     * O(n)
     */
    public long subarraySum(int[] nums, int k) {
        long cnt = 0;
        long sum = 0;
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0L) + 1);
        }
        return cnt;
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
    private static void printPermutationDup(String str, String word) {
        if (word.length() == str.length()) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            printPermutationDup(str, word + str.charAt(i));
        }
    }

    public static void permuteDup(String str) {
        printPermutationDup(str, "");
    }

    /**
     * 順列一覧(重複なし)
     */
    private static void permutate(char[] c, String word, int len) {
        if (word.length() >= len) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i < c.length; i++) {
            char[] nodup = new char[c.length - 1];
            int idx = 0;
            for (int j = 0; j < c.length; j++) {
                if (i == j) {
                    continue;
                }
                nodup[idx++] = c[j];
            }
            permutate(nodup, word + c[i], len);
        }
    }

    public static void permute(String str) {
        permutate(str.toCharArray(), "", str.length());
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
     * いもす法. 累積和
     * 区間に値を加算する (最後に、最終的な区間の値をまとめて知る).
     */
    public static int[] imos(int n, int[] l, int[] r) {
        int[] ans = new int[n + 2];
        int q = l.length;
        for (int i = 0; i < q; i++) {
            ans[l[i]]++;
            ans[r[i] + 1]--;
        }
        for (int i = 1; i <= n; i++) {
            ans[i] += ans[i - 1];
        }
        return ans;
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
     * 二項定理.パスカルの三角形.
     * nCkInit();
     * nCk(n,k);
     */
    private static final int MOD = 1000000007;
    private static long[] fac = new long[1000000];
    private static long[] finv = new long[1000000];
    private static long[] inv = new long[1000000];

    public static void nCkInit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 1000000; i++) {
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
     * パスカルの三角形を生成
     */
    public static List<List<Integer>> generatePascal(long numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    /**
     * 2次元配列のソート.
     */
    public static void twoDArraySort(long[][] arr) {
        // a[0][0] -a[n][0] を比較してソート
        Arrays.sort(arr, Comparator.comparingLong(a -> a[0]));

        // reversed
        Arrays.sort(arr, Comparator.comparingLong((long[] a) -> a[0]).reversed());
    }

    /**
     * Mapをvalueでソート.
     */
    public static void sortMapByValue() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Map<Integer, Integer> sorted = map.entrySet()
                                          .stream()
                                          .sorted(Entry.comparingByValue())
                                          .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                                                    (e1, e2) -> e1, LinkedHashMap::new));
        for (Entry<Integer, Integer> e : sorted.entrySet()) {
        }
    }

    /**
     * bit全探索. 部分集合を全列挙.
     */
    public static void bitSearch() {
        int[] abc = new int[] { 0, 1, 2 };
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
     * 二分探索。めぐる式
     */
    public static int binarySearch(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        int mid;
        while (right - left > 1) {
            mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                // 左側にある
                right = mid;
            } else {
                // 右側にある
                left = mid;
            }
        }
        return right;
    }

    /**
     * 幅優先探索.
     */
    public static void bfs(char[][] c, int h, int w) {
        Deque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(0, 0));
        int depth = 1;
        boolean[][] visited = new boolean[h][w];
        visited[0][0] = true;
        final int[][] DXDY = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
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
                    if (x < 0 || x >= h || y < 0 || y >= w || c[x][y] == '#' || visited[x][y]) {
                        continue;
                    }
                    visited[x][y] = true;
                    queue.add(new Point(x, y));
                }
            }
        }
    }

    /**
     * DFS: 深さ優先探索.
     * gridの1を辿る.
     */
    private static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    private static long dfsInit(int[][] grid) {
        int depth = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    depth++;
                }
            }
        }
        return depth;
    }

    /**
     * Dijsktra. ダイキストラ. 最短経路問題.
     */
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // Build the adjacency matrix
        int[][] adj = new int[n][n];
        for (int[] flight : flights) {
            adj[flight[0]][flight[1]] = flight[2];
        }
        // Shortest distances array
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        // Shortest stops array
        int[] stops = new int[n];
        Arrays.fill(stops, Integer.MAX_VALUE);
        dist[src] = 0;
        stops[src] = 0;

        // The priority queue would contain (city, distance_from_source, stops_from_source)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[] { src, 0, 0 });
        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            int u = arr[0];
            int dist_u = arr[1];
            int stops_u = arr[2];
            // If destination is reached, return the distance to get here
            if (u == dst) {
                return dist_u;
            }
            // If there are no more steps left, continue
            if (stops_u == K + 1) {
                continue;
            }

            // Examine and relax all neighboring edges if possible
            for (int v = 0; v < n; v++) {
                if (adj[u][v] > 0) {
                    // Less cost?
                    if (dist_u + adj[u][v] < dist[v]) {
                        dist[v] = dist_u + adj[u][v];
                        pq.offer(new int[] { v, dist[v], stops_u + 1 });
                    }
                    // Less stops?
                    else if (stops_u + 1 < stops[v]) {
                        stops[v] = stops_u + 1;
                        pq.offer(new int[] { v, dist_u + adj[u][v], stops_u + 1 });
                    }
                }
            }
        }
        return -1;
    }

    /**
     * 優先度付きキュー.PriorityQueue. TopK
     * 小さい順のトップK.
     */
    public static int topK(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n2 - n1);
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
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
        System.out.println(topK(new int[] { 1, 2, 3, 4 }, 3));
    }

}
