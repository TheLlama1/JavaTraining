package Day5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String gender = scanner.next();
        int id = scanner.nextInt();
        int clas = scanner.nextInt();
        int numInClass = scanner.nextInt();
        double grade = scanner.nextDouble();

        //Teacher teacher = new Teacher();
        Student student = new Student(name, gender, id, clas, numInClass, grade);
        //teacher.TeacherInfo();
        student.StudentInfo();
    }
}
