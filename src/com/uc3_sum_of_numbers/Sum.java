package com.uc3_sum_of_numbers;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the range to be summed");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i <= a) {
            sum += i;
            i++;
        }
        System.out.println("The sum of "+a+" natural numbers is "+sum);
    }
}
