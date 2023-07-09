package Day5;

import java.util.ArrayList;
import java.util.List;
//Martin
public class Main {

    public void highestGrade(List<Student> student){

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
        List<Person> people = new ArrayList<>();

        Student student1 = new Student("Dimitar", "Male", 10412, 10, 9);
        student1.StudentInfo();
        student1.subjectGrade("Math", 4.50);
        student1.subjectGrade("Science", 4.50);
        student1.subjectGrade("Geography", 6.00);
        student1.subjectGrade("History", 5.00);

        System.out.println("---------------------------------------");

        Student student2 = new Student("Lilqna", "Female", 41351, 10, 14);
        student2.StudentInfo();
        student2.subjectGrade("Math", 5.00);
        student2.subjectGrade("Science", 5.00);
        student2.subjectGrade("Geography", 6.00);
        student2.subjectGrade("History", 6.00);

        System.out.println("---------------------------------------");
    }
}
