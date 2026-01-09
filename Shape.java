import java.util.Scanner;
class Shapee {
    void Calculatearea() {
        // System.out.println("Area calculation for shape not defined");
    }
}
class Circle extends Shapee {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void Calculatearea() {
        double area = 3.1416 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shapee {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void Calculatearea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shapee {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void Calculatearea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter circle radius:");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.Calculatearea();

        System.out.println("Enter rectangle length and width:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle rect = new Rectangle(l, w);
        rect.Calculatearea();

        System.out.println("Enter triangle base and height:");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle tri = new Triangle(b, h);
        tri.Calculatearea();
    }
}

