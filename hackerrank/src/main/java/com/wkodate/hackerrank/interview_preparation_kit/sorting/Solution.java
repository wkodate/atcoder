package com.wkodate.hackerrank.interview_preparation_kit.sorting;

import java.util.Arrays;

public class Solution {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int count = 0;
        int sum = 0;
        for (int price : prices) {
            if (sum + price > k) {
                return count;
            }
            sum += price;
            count++;
        }
        return count;
    }

    static void countSwaps(int[] a) {
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swaps++;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    public static void main(String args[]) {
    }

}
