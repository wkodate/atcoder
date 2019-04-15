package com.wkodate.atcoder.abc124.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArr = s.split("");

        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int prev = i;
            int count = 0;
            for (int j = 0; j < sArr.length; j++) {
                int current = Integer.parseInt(sArr[j]);
                if (prev == 0) {
                    if (current == 0) {
                        count++;
                    }
                    prev = 1;
                } else if (prev == 1) {
                    if (current == 1) {
                        count++;
                    }
                    prev = 0;
                }
            }
            countList.add(count);
        }
        System.out.println(Collections.min(countList));
    }

}
