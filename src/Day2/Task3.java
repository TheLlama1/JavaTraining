package Day2;
import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = word.nextLine();
        for(int i = 0; i < word1.length(); i++){
            System.out.println((word1.charAt(i)));
        }

    }

}
