package com.wkodate.atcoder.abc042.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        Arrays.sort(n);
        if (n[0] == 5 && n[1] == 5 && n[2] == 7) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
