package com.wkodate.atcoder.abc036.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (true) {
            count++;
            if (a * count >= b) {
                System.out.println(count);
                return;
            }
        }
    }

}
