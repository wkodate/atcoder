package com.wkodate.atcoder.abc017.b;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        x = x.replaceAll("ch", "")
                .replaceAll("o", "")
                .replaceAll("k", "")
                .replaceAll("u", "");
        if (x.equals("")) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
