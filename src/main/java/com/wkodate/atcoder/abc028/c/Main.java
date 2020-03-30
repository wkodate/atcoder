package com.wkodate.atcoder.abc028.c;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    q.offer(num[i] + num[j] + num[k]);
                    if (q.size() > 3) {
                        q.poll();
                    }
                }
            }
        }
        System.out.println(q.poll());
    }

}
