package com.wkodate.atcoder.arc003.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String r = sc.next();
        int sum = 0;
        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            if (c == 'A') {
                sum += 4;
            } else if (c == 'B') {
                sum += 3;
            } else if (c == 'C') {
                sum += 2;
            } else if (c == 'D') {
                sum += 1;
            }
        }
        System.out.println((double) sum / n);
    }

}
