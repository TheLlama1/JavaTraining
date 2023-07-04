package Day2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


            Scanner name = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name1 = name.next();

            Scanner pass = new Scanner(System.in);
            System.out.println("Enter password: ");
            String pass1 = pass.next();

            System.out.println("Log in with your username: ");
            String name2 = name.next();
            if(name1.equals(name2)){
                System.out.println("Log in with your password");
                String pass2 = pass.next();
                if(pass1.equals(pass2)){
                    System.out.println("Welcome, " + name1);
                }else{
                    System.out.println("Wrong information");
                }
            }else {
                System.out.println("Wrong name !");
        }
    }
}