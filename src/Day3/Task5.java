package Day3;
import java.util.ArrayList;
import java.util.Scanner;
public class Task5
{
    public static void swap(ArrayList<String> arrayList)
    {
        if(arrayList.size() >= 2){
        String first = arrayList.get(0);
        String second = arrayList.get(arrayList.size() - 1);

        arrayList.set(0, second);
        arrayList.set(arrayList.size() - 1, first);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.print("Enter how many words do you want to write: ");
        int boundary = scanner.nextInt();

        for(int i = 0; i < boundary; i++){
            System.out.print("Enter your word: ");
            String word = scanner.next();
            arr.add(word);
        }
        swap(arr);
        for(String element: arr){
            System.out.print(element+ ",");
        }
    }
}
