package com.wkodate.atcoder.arc044.a;

import java.util.Scanner;

public class Main {

    private static boolean isPrime(long x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long num = n;
        long sum = 0;
        int i = String.valueOf(num).length() - 1;
        while (i >= 0) {
            sum += num / Math.pow(10, i);
            num %= Math.pow(10, i);
            i--;
        }
        if (n != 1 && (isPrime(n) || ((n % 10) % 2 != 0 && (n % 10) != 5 && sum % 3 != 0))) {
            System.out.println("Prime");
            return;
        }
        System.out.println("Not Prime");
    }

}
