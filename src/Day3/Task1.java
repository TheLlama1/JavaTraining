package Day3;
import java.util.Scanner;
public class Task1 {
    public static void positive(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("Positive numbers: " + arr[i]);
            }
        }
    }
    public static void negative(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Negative numbers:" + arr[i]);
            }
        }
    }
    public static void odd(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd numbers: " + arr[i]);
            }
        }
    }
    public static void even(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0) {
                System.out.println("Even numbers: " + arr[i]);

            }
        }
    }
    public static void fives(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int num : arr) {
                if (num == 5) {
                    count++;
                }
            }
        }
        System.out.println("Fives: " + count);
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -1, 1, 5, 9, 7, 6, 5, -5};
        positive(arr);
        negative(arr);
        odd(arr);
        even(arr);
        fives(arr);
        }
    }

