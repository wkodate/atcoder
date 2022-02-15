package com.wkodate.atcoder.abc026.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        Arrays.sort(r);
        boolean red = true;

        double sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (red) {
                sum += Math.pow(r[i], 2) * Math.PI;
                red = false;
                continue;
            }
            sum -= Math.pow(r[i], 2) * Math.PI;
            red = true;
        }
        System.out.println(sum);
    }

}
