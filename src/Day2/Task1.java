package Day2;
import java.util.Scanner;
//Martin
public class Task1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7: ");
        int num1 = num.nextInt();
        switch(num1){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        }
    }
}
