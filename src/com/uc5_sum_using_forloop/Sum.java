package com.uc5_sum_using_forloop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the range to be summed");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println("The sum of "+a+" natural numbers is "+sum);
    }
}
