package com.wkodate.atcoder.abc001.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deg = sc.nextInt();
        int dis = sc.nextInt();
        String[] DIR = {
                "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S",
                "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW", "N"
        };
        int[] W = { 0, 15, 93, 201, 327, 477, 645, 831, 1029, 1245, 1467, 1707, 1959 };
        String dir = DIR[((10 * deg + 1125) / 2250 + 15) % 16];
        int w = 0;
        for (int i = 0; i < W.length; i++) {
            if (W[i] > dis) {
                break;
            }
            w = i;
        }
        if (w == 0) {
            dir = "C";
        }
        System.out.println(dir + " " + w);
    }

}
