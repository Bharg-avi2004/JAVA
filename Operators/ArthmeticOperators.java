package Operators;

public class ArthmeticOperators {
    
 static void addition(int a, int b) {
    int add = a + b;
    System.out.println("Addition " + add);
}

static void subtraction(int a, int b) {
    int sub = a - b;
    System.out.println("Subtraction" + sub);
}

static void multiplication(int a, int b) {
    int mul = a * b;
    System.out.println("Multiplication " + mul);
}
public static void main(String[] args) {
    int a = 10;
    int b = 0;
    addition(a, b);
    subtraction(a, b);
    multiplication(a, b);
}
}