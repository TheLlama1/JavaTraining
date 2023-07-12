package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void findTheNumbers(String calculations){
        char[] chars = calculations.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
    public static String makeTheEquation(String calculations){
        calculations = calculations.replaceAll("[^0-9]", " ");
        calculations = calculations.replaceAll(" +", " ");

        if (calculations.equals("")) {
            return "-1";
        }
        return calculations;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your calculation: ");
        String calculation = scanner.nextLine();
        String [] temp = makeTheEquation(calculation).split(" ");
        int[] nums = new int[temp.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(temp[i]);
        }
        if(calculation.contains("+") || calculation.contains("plus") || calculation.contains("Plus")){
            System.out.println(nums[0] + nums[1]);
        }else if(calculation.contains("-") || calculation.contains("minus") || calculation.contains("Minus")){
            System.out.print(nums[0] - nums[1]);
        }else if(calculation.contains("*") || calculation.contains("multiply") || calculation.contains("Multiply")){
            System.out.println(nums[0] * nums[1]);
        }else if(calculation.contains("/") || calculation.contains("divide") || calculation.contains("Divide")){
            System.out.println(nums[0] / nums[1]);
        }
    }
}
