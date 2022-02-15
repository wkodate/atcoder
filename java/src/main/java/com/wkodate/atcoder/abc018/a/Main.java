package com.wkodate.atcoder.abc018.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int count = 3;
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                if (abc[i] > abc[j]) {
                    count--;
                }
            }
            System.out.println(count);
        }
    }

}
