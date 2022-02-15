package com.wkodate.atcoder.abc029.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<String> ans;

    private static void permutation(String str, int n, String word) {
        if (word.length() == n) {
            ans.add(word);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permutation(str, n, word + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans = new ArrayList<>();
        permutation("abc", n, "");
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
