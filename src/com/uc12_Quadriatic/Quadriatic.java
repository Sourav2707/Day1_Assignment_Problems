package com.uc12_Quadriatic;
import java.util.Scanner;

public class Quadriatic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double root1, root2;
        double val = b * b - 4 * a * c;
        if (val > 0) {
            root1 = (-b + Math.sqrt(val)) / (2 * a);
            root2 = (-b - Math.sqrt(val)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if (val == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-val) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
