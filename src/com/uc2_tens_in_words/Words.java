package com.uc2_tens_in_words;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        System.out.println("Enter 1, 10, 100,..............");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1)
            System.out.println("One");
        else if(a == 100)
            System.out.println("Hundred");
        else if(a == 1000)
            System.out.println("Thousand");
        else if(a == 10000)
            System.out.println("Ten thousand");
        else if(a == 100000)
            System.out.println("One lack");
        else if(a == 1000000)
            System.out.println("Ten lacks/One Million");
        else if(a == 10000000)
            System.out.println("One crore/Ten Million");
        else
            System.out.println("Number data out of bound");
    }
}
