package Loops;

public class MultipleIfElse {
    public static void main(String[] args) {
        int a = 500, b = 450, c = 320;
        if (a > b && a > c) {
            System.out.println(a + " is the Largest Number");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the Largest Number");
        }
        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}
