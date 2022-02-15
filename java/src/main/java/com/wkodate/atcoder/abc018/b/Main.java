package com.wkodate.atcoder.abc018.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            String[] target = result.substring(l[i] - 1, r[i]).split("");
            String reversed = "";
            for (int j = target.length - 1; j >= 0; j--) {
                reversed += target[j];
            }
            result.replace(l[i] - 1, r[i], reversed);
        }
        System.out.println(result);
    }

}
