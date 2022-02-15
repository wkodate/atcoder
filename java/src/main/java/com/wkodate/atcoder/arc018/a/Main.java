package com.wkodate.atcoder.arc018.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double bmi = sc.nextDouble();
        System.out.println(h * h / 10000 * bmi);
    }

}
