package Day5;

import java.util.Scanner;

public class Rectangle implements Shape {

    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter(){
        return 2*(a + b);
    }
    }

