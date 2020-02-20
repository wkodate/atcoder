package com.wkodate.atcoder.abc019.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].equals(s[i + 1])) {
                count++;
                continue;
            }
            result.append(s[i]).append(count);
            count = 1;
        }
        result.append(s[s.length - 1]).append(count);
        System.out.println(result);
    }

}
