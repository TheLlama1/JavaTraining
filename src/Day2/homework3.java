package Day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Martin
public class homework3 {
    public static void main(String[] args)
    {
    List<String> word = new ArrayList<String>();
    System.out.println("Enter the four words: ");
    Scanner text = new Scanner(System.in);

    for(int i = 0; i < 4; i++)
    {
    word.add(text.next());
    }
    word.removeIf(words -> words.length() < 4);
    for(String words : word){
    System.out.println(words);
    }
    text.close();
    }
}
