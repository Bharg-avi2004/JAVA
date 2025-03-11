package Inheritance;
class A {
    void methodA1() {
      System.out.println("Method A1");
    }
  
    void methodA2() {
      System.out.println("Method A2");
    }
  
    void overrideMethod() {
      System.out.println("Override method in Class A");
    }
  }
  class B extends A {
    void methodB1() {
      System.out.println("Method B1");
    }
  
    void methodB2() {
      System.out.println("Method B2");
    }
    void overrideMethod() {
      System.out.println("Override method in Class B");
    }
  }
  class C extends A {
  
}
void methodC1() {
    System.out.println("Method C1");
  }

  void methodC2() {
    System.out.println("Method C2");
  }
  void overrideMethod() {
    System.out.println("Override method in Class C");
  }

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    System.out.println("Methods of Class A:");
    a.methodA1();
    a.methodA2();
    a.overrideMethod();
    System.out.println("\nMethods of Class B:");
    b.methodA1();
    b.methodA2();
    b.methodB1();
    b.methodB2();
    b.overrideMethod();
    System.out.println("\nMethods of Class C:");
    c.methodA1(); 
    c.methodA2(); 
    c.methodC1();
    c.methodC2();
    c.overrideMethod();
  }





