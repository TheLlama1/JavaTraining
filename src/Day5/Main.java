package Day5;

import java.util.Scanner;
//Martin
public class Main {
    public void highestGrade(){

    }

    public void lowestGrade(){

    }

    public static void main(String[] args) {
        System.out.print("Teachers");
        Teacher teacher1 = new Teacher("Naiden", "Male", 19412, "PGEE", "Geography", 1400);
        Teacher teacher2 = new Teacher("Roger", "Male", 18173, "PGEE", "PE", 1500);
        teacher1.TeacherInfo();
        System.out.println("---------------------------------------");
        teacher2.TeacherInfo();
        System.out.println("---------------------------------------");
        System.out.println("Students");
        System.out.println("---------------------------------------");
        Student student1 = new Student("Dimitar", "Male", 10412, 10, 9, 5.41);
        Student student2 = new Student("Lilqna", "Female", 41351, 10, 14, 5.53);
        student1.StudentInfo();
        System.out.println("---------------------------------------");
        student2.StudentInfo();
        System.out.println("---------------------------------------");
    }
}
