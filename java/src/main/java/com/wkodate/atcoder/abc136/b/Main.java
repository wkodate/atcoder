package com.wkodate.atcoder.abc136.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).length() % 2 == 0) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }

}

