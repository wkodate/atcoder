package com.wkodate.atcoder.abc058.a;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b - a == c - b) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}