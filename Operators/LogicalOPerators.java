package Operators;

public class LogicalOPerators {
    public static void main(String[] args) {
        int a = 55;
        int b = 60;
        int c = 25;
        System.out.println(a > b && a > c);
        System.out.println(a > b && a < c);
        System.out.println(a > b || a > c);
        System.out.println(a < b || a < c); 
        System.out.println(!(a > b));      
        System.out.println(!(a < b));     
    }
}
