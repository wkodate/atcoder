package com.wkodate.atcoder.abc012.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hour = n / 3600;
        int min = (n - hour * 3600) / 60;
        int sec = n - (hour * 3600 + min * 60);
        System.out.println(
                String.format("%02d", hour)
                        + ":"
                        + String.format("%02d", min)
                        + ":"
                        + String.format("%02d", sec));
    }

}
