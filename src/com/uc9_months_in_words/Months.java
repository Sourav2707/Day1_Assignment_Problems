package com.uc9_months_in_words;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any month in numerics (1 - 12): ");
        int a = sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println(a+" is Januanry");
                break;
            case 2:
                System.out.println(a+" is February");
                break;
            case 3:
                System.out.println(a+" is March");
                break;
            case 4:
                System.out.println(a+" is April");
                break;
            case 5:
                System.out.println(a+" is May");
                break;
            case 6:
                System.out.println(a+" is June");
                break;
            case 7:
                System.out.println(a+" is July");
                break;
            case 8:
                System.out.println(a+" is August");
                break;
            case 9:
                System.out.println(a+" is September");
                break;
            case 10:
                System.out.println(a+" is October");
                break;
            case 11:
                System.out.println(a+" is November");
                break;
            case 12:
                System.out.println(a+" is December");
                break;
            default:
                System.out.println(a+" is invalid month");
        }
    }
}
