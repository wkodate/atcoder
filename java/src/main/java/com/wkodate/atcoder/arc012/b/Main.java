package com.wkodate.atcoder.arc012.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int va = sc.nextInt();
        int vb = sc.nextInt();
        int l = sc.nextInt();
        double la = 0;
        double lb = l;
        for (int i = 0; i < n; i++) {
            double t = (lb - la) / va;
            la += va * t;
            lb += vb * t;
        }
        System.out.println(Math.max(lb - la, 0));
    }

}
