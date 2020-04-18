package com.wkodate.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        return target;
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
     * ビット全探索. 部分集合を全列挙.
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
