package Day2;
import java.util.Scanner;
//Martin
public class Task4
{
    public static void main(String[] args)
    {
        Scanner weight = new Scanner(System.in);
        System.out.println("What is your weight ?");
        int weight1 =  weight.nextInt();
        if(weight1 >= 50 && weight1 <= 70){
            System.out.println("Skinny");
        }else if(weight1 >=71 && weight1 <= 90){
            System.out.println("Skinny fat");
        }else if(weight1 >= 91 && weight1 <= 110){
            System.out.println("Obese");
        }else if(weight1 > 110){
            System.out.println("Extra obese");
        }else{
            System.out.println("Wrong weight");
        }
    }
}
