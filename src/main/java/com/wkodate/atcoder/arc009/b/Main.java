package com.wkodate.atcoder.arc009.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        Map<Integer, Integer> convert = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
            convert.put(b[i], i);
        }
        int n = sc.nextInt();
        Map<Integer, Integer> originalToConverted = new HashMap<>();
        int[] a = new int[n];
        int[] converted = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            String astr = String.valueOf(a[i]);
            for (int j = 0; j < astr.length(); j++) {
                int num = astr.charAt(j) - '0';
                sb.append(convert.get(num));
            }
            converted[i] = Integer.parseInt(sb.toString());
            originalToConverted.put(a[i], converted[i]);
        }
        Arrays.sort(converted);
        int[] ans = new int[n];
        Map<Integer, List<Integer>> convertedToIdxList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            if (convertedToIdxList.containsKey(converted[i])) {
                list = convertedToIdxList.get(converted[i]);
            }
            list.add(i);
            convertedToIdxList.put(converted[i], list);
        }
        for (int i = 0; i < n; i++) {
            List<Integer> idxList = convertedToIdxList.get(originalToConverted.get(a[i]));
            for (int j = 0; j < idxList.size(); j++) {
                ans[idxList.get(j)] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

}
