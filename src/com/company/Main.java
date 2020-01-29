package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month;
        int alive_month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        alive_month = sc.nextInt();
        long arr [][] = new long[month][alive_month];
        for (int i = 0; i < month ; i++) {
            for (int j = 0; j <alive_month ; j++) {
                arr[i][j] = 0;

            }


        }
        arr[0][0] = 1;

        arr[1][1] = 1;

        long sum = 0;
        long[] next = new long[alive_month];
        for (int i = 2; i < month; i++) {
            sum = 0;
            for (int j = 0; j < alive_month; j++) {
                if (j+1 != alive_month) {
                    arr[i][j+1] = arr[i - 1][j];
                    sum = sum + arr[i - 1][j+1];
                }

            }
            arr[i][0] = sum;

        }

        long summ = 0;

        for (int i = 0; i < alive_month ; i++) {

            summ = summ + arr[month-1][i];
        }

        System.out.println(summ);
    }
}
