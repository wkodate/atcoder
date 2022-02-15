package com.wkodate.atcoder.agc013.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] n = new int[c];
        int[] m = new int[c];
        int[] l = new int[c];
        int nmax = 0;
        int mmax = 0;
        int lmax = 0;
        for (int i = 0; i < c; i++) {
            n[i] = sc.nextInt();
            m[i] = sc.nextInt();
            l[i] = sc.nextInt();
            int[] nml = { n[i], m[i], l[i] };
            Arrays.sort(nml);
            nmax = Math.max(nmax, nml[0]);
            mmax = Math.max(mmax, nml[1]);
            lmax = Math.max(lmax, nml[2]);
        }
        System.out.println(nmax * mmax * lmax);
    }

}
