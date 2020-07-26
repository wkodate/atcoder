package com.wkodate.atcoder.arc019.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("O", "0");
        s = s.replaceAll("D", "0");
        s = s.replaceAll("I", "1");
        s = s.replaceAll("Z", "2");
        s = s.replaceAll("S", "5");
        s = s.replaceAll("B", "8");
        System.out.println(s);
    }

}
