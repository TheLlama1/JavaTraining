package Day3;
import java.util.Scanner;
public class Task2 {
    public static void replacement(String wrd1, String wrd2) {

        if (wrd1.contains(wrd2)) {
            String result = wrd1.replace(wrd2, "");
            System.out.print(result);
        }
    }
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String word1 = word.next();
        System.out.print("Enter your second word: ");
        String word2 = word.next();
        replacement(word1, word2);

    }
}
