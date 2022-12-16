package com.uc7_palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to check for palindrome: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //132
        int temp = a;
        int rev = 0;
        for (;temp != 0;) // skipping initialization and increment part only providing condition part
        {
            int rem = temp % 10; //2 -- next iteration //3 -- next iteration // 1
            temp = temp / 10; //13 -- next iteration //1 -- next iteration // 0 loop stops
            rev = (rev * 10) + rem;
        }
        if( a == rev)
            System.out.println("The number "+a+" is a palindrome number");
        else
            System.out.println("The number "+a+" is not a palindrome number");
    }
}
