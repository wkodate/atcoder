package com.wkodate.atcoder.abc023.b;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String result = "b";
        for (int i = 0; i <= (n + 1) / 2; i++) {
            if (i % 3 == 1) {
                result = "a" + result + "c";
            } else if (i % 3 == 2) {
                result = "c" + result + "a";
            } else if (i != 0 && i % 3 == 0) {
                result = "b" + result + "b";
            }
            if (s.equals(result)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}
