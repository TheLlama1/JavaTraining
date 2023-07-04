package Day2;
import java.util.Scanner;
//Martin
public class homework1 {
    public static void main(String[] args){
        String [] word = {"Алфа", "Аватар", "Беда", "Бреза", "Салон"};
        for(String words : word)
        {
         if(words.charAt(0) == 'А'){
             System.out.println(words);
         }
        }
    }
}
