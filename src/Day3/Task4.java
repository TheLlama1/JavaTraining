package Day3;
import java.util.Scanner;
public class Task4
{
    public static void inicials(String firstName, String lastName)
    {
        System.out.print(firstName.charAt(0));
        System.out.print(lastName.charAt(0));
    }
    public static void main(String[] args)
    {
    Scanner name = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = name.next();
        System.out.print("Enter the last name: ");
        String secondName = name.next();
        inicials(firstName, secondName);
    }
}
