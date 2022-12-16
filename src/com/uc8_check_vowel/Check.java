package com.uc8_check_vowel;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter to check whether vowel or consonant");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'a':
                System.out.println(a+" is vowel");
                break;
            case 'e':
                System.out.println(a+" is vowel");
                break;
            case 'i':
                System.out.println(a+" is vowel");
                break;
            case 'o':
                System.out.println(a+" is vowel");
                break;
            case 'u':
                System.out.println(a+" is vowel");
                break;
            default:
                System.out.println(a+" is a consonant");

        }
    }
}
