package com.uc1_single_digit_int_words;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        System.out.println("Enter any single digit number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0)
            System.out.println("Zero");
        else if(a == 1)
            System.out.println("One");
        else if(a == 2)
            System.out.println("Two");
        else if(a == 3)
            System.out.println("Three");
        else if(a == 4)
            System.out.println("Four");
        else if(a == 5)
            System.out.println("Five");
        else if(a == 6)
            System.out.println("Six");
        else if(a == 7)
            System.out.println("Seven");
        else if(a == 8)
            System.out.println("Eight");
        else
            System.out.println("Nine");
    }
}
