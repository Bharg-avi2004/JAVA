package Loops;

import java.util.Scanner;
public class MaleFemaleSwitch {
    public static void main(String[] args) {
        System.out.print("Enter Character (M/F)  : ");
        Scanner sc = new Scanner(System.in);
        char Gender = sc.next().charAt(0);
        switch (Gender) {
            case 'F':
                System.out.println("Gender is FeMale");
                break;
            case 'M':
                System.out.println("Gender is Male");
                break;
        }
    } 
}
