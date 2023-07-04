package Day2;
import java.util.Scanner;
//Martin
public class homework2
{
    static int sum(int [] arr){
        int sum = 0;
        for(int number : arr)
        {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args)
    {

        int [] array = new int[5];

        System.out.println("Write 5 numbers: ");
        Scanner num = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
        array[i] = num.nextInt();
        }
        System.out.println(sum(array));
    }
}
