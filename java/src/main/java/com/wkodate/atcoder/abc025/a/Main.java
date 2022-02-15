package com.wkodate.atcoder.abc025.a;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int n = sc.nextInt();
        System.out.println(s[(n-1) / s.length] + s[(n - 1) % s.length]);
    }

}
