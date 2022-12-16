package com.uc10_arithmatic_operatiions;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp1 = a + b;
        System.out.println("c = a + b =" + temp1);
        int temp2 = a * b;
        System.out.println("c = a * b =" + temp2);
        var temp3 = a / b;
        System.out.println("c = a / b =" + temp3);
        int temp4 = a % b;
        System.out.println("c = a % b =" + temp4);
        int[] intArray = {temp1, temp2, temp3, temp4};
        int min = temp1;
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min)
                min = intArray[i];
            if (intArray[i] > max)
                max = intArray[i];
        }
        System.out.println("The minimum values is " + min);
        System.out.println("The maximum values is " + max);
    }
}
