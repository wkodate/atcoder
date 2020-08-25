package com.wkodate.atcoder.abc014.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] arr = new int[1_000_002];
        for (int i = 0; i < n; i++) {
            arr[a[i]]++;
            arr[b[i] + 1]--;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
    }

}
