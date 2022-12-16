package com.uc6_reverse_using_forloop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number to be reversed: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //132
        int rev = 0;
        for (;a != 0;) // skipping initialization and increment part only providing condition part
        {
            int rem = a % 10; //2 -- next iteration //3 -- next iteration // 1
            a = a / 10; //13 -- next iteration //1 -- next iteration // 0 loop stops
            rev = (rev * 10) + rem;
        }
        System.out.println(rev);
    }
}
