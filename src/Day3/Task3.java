package Day3;
import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {

        String sentence = "I love java";
        String [] temporary = sentence.split(" ");
        sentence = "";
        for(int i = temporary.length - 1; i >= 0; i--) {
        sentence = sentence.concat(temporary[i] + " ");
        }
        System.out.print(sentence);
    }
}
