package com.wkodate.atcoder.caddi2018.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '2') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
