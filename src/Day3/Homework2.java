package Day3;
import java.util.Scanner;
//Martin
public class Homework2 {
    public static void oddOrEven(int num)
    {
    if(num % 2 == 0){
        System.out.print(true);
    }else if(num % 2 != 0){
        System.out.print(false);
    }
    }
    public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      System.out.print("Enter your number: ");
      int num = number.nextInt();
      oddOrEven(num);
    }
}
