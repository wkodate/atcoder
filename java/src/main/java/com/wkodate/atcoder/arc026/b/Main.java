package com.wkodate.atcoder.arc026.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Long> divisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i < n; i++) {
            if (n % i != 0) {
                continue;
            }
            list.add(i);
            if (i != 1 && i * i != n) {
                list.add(n / i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> divList = divisors(n);
        long sum = 0;
        for (int i = 0; i < divList.size(); i++) {
            sum += divList.get(i);
        }
        if (sum < n) {
            System.out.println("Deficient");
        } else if (sum > n) {
            System.out.println("Abundant");
        } else {
            System.out.println("Perfect");
        }
    }

}
