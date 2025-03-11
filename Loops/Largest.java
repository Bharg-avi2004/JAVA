package Loops;

import java.util.Scanner;

public class Largest {
     public static void main(String[] args) {

        int a, b, c;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = num.nextInt();
        System.out.print("Enter Second Number : ");
        b = num.nextInt();
        System.out.print("Enter Third Number : ");
        c = num.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("Largest Number: " + a);
        }
        else if ((b > a) && (b > c)) {
            System.out.println("Largest Number: " + b);
        }
        else {
            System.out.println("Largest Number: " + c);
        }
    }
}
