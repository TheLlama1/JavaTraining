package Day3;
import java.util.Scanner;
//Martin
public class Homework1
{
    public static void returnTheSmallest(int num1, int num2, int num3)
    {
        if(num1 < num2 && num1 < num3)
        {
            System.out.print("The smallest number is: " + num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.print("The smallest number is: " + num2);
        }else if(num3 < num1 && num3 < num2){
            System.out.print("The smallest number is: " + num3);
        }
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = number.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = number.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = number.nextInt();
        returnTheSmallest(num1, num2, num3);
    }
}
