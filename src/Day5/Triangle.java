package Day5;

public class Triangle implements Shape {
    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    @Override
    public double calculateArea() {

        return a*h/2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
