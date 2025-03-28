        abstract class Shape {  
        public abstract double calculateArea();
        public void displayInfo() {  
            System.out.println("This is a shape.");  
        }  
    }   
    class Circle extends Shape {  
        private double radius;  
    
        public Circle(double radius) {  
            this.radius = radius;  
        }  
        @Override  
        public double calculateArea() {  
            return Math.PI * radius * radius;  
        }  
    }  
    class Rectangle extends Shape {  
        private double length;  
        private double width;  
    
        public Rectangle(double length, double width) {  
            this.length = length;  
            this.width = width;  
        }  
        @Override  
        public double calculateArea() {  
            return length * width;  
        }  
    }
    public class AbstractClass {  
        public static void main(String[] args) {  
            Circle circle = new Circle(5);  
            Rectangle rectangle = new Rectangle(4, 6);  
            circle.displayInfo();  
            System.out.println("Area of the circle: " + circle.calculateArea());  
            rectangle.displayInfo();  
            System.out.println("Area of the rectangle: " + rectangle.calculateArea());  
        }  
    }
