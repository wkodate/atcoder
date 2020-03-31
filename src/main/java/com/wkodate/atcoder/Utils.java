package com.wkodate.atcoder;

import java.util.Arrays;
import java.util.Comparator;

public class Utils {

    /**
     * 最大公約数.
     */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * 最小公倍数.
     */
    private static int lcm(int a, int b) {
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
        return -1;
    }

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

    /**
     * next permutation.次の順列.
     */
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

    private static void printPermutation(String str, String word) {
        if (word.length() == str.length()) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            printPermutation(str, word + str.charAt(i));
        }
    }

    /**
     * 順列一覧(重複あり)
     */
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
     * 二分探索
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
     * 2次元配列のキーソート.
     */
    public static void twoDArraySort(long[][] arr) {
        Arrays.sort(arr, Comparator.comparingLong(a -> a[0]));
        // reversed
        Arrays.sort(arr, Comparator.comparingLong((long[] a) -> a[0]).reversed());
    }

}
