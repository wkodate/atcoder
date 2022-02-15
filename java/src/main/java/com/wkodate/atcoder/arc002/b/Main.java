package com.wkodate.atcoder.arc002.b;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("/");
        LocalDate date = LocalDate.of(
                Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        while (date.getYear() <= 2999
                && date.getYear() % (date.getMonthValue() * date.getDayOfMonth()) != 0) {
            date = date.plusDays(1);
        }
        StringJoiner sj = new StringJoiner("/");
        sj.add(String.valueOf(date.getYear()));
        sj.add(String.format("%02d", date.getMonthValue()));
        sj.add(String.format("%02d", date.getDayOfMonth()));
        System.out.println(sj.toString());
    }

}
