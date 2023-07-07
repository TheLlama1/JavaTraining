package Day5;
import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.print("Rectangle or Triangle: ");
        String answer = choice.next();
        if(answer.equals("Triangle") || answer.equals("triangle")){
            Scanner num = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = num.nextDouble();
            System.out.print("Enter b: ");
            double b = num.nextDouble();
            System.out.print("Enter c: ");
            double c = num.nextDouble();
            System.out.print("Enter h: ");
            double h = num.nextDouble();

            Triangle triangle = new Triangle(a, b, c, h);
            System.out.println("Triangle area: " + triangle.calculateArea());
            System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        }else if(answer.equals("Rectangle")  || answer.equals("rectangle")){
            Scanner num = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = num.nextDouble();
            System.out.print("Enter b: ");
            double b = num.nextDouble();
            Rectangle rectangle = new Rectangle(a, b);
            System.out.println("Rectangle area: " + rectangle.calculateArea());
            System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        }else{
            System.out.print("Wrong value");
        }

    }
}
