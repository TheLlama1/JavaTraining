package Day5;

import java.util.List;

//Martin
public class Main {

    public static void highestGrade(Student student1, Student student2){
        if(student1.getSubjectGrade() > student2.getSubjectGrade()){
            System.out.println("The person with the highest grade in the subject is " + student1.getName());
        }else{
            System.out.println("The person with the highest grade in the subject is " + student2.getName());
        }
    }

    public static void lowestGrade(Student student1, Student student2){
        if(student1.getSubjectGrade() < student2.getSubjectGrade()){
            System.out.println("The person with the lowest grade in the subject is " + student1.getName());
        }else{
            System.out.println("The person with the lowest grade in the subject is " + student2.getName());
        }
    }
    public static void averageSalary(Teacher teacher1, Teacher teacher2){
        System.out.println((teacher1.salary + teacher2.salary)/2);
    }
    public static void main(String[] args) {
        System.out.print("Teachers");
        Teacher teacher1 = new Teacher("Naiden", "Male", 19412, "PGEE", "Geography", 1600);
        Teacher teacher2 = new Teacher("Roger", "Male", 18173, "PGEE", "PE", 1500);
        teacher1.TeacherInfo();
        System.out.println("---------------------------------------");
        teacher2.TeacherInfo();
        System.out.println("---------------------------------------");
        System.out.print("Average salary: ");
        averageSalary(teacher1, teacher2);
        System.out.println("---------------------------------------");
        System.out.println("Students");
        System.out.println("---------------------------------------");

        Student student1 = new Student("Dimitar", "Male", 10412, 10, 9);
        student1.StudentInfo();
        student1.subjectGrade("Math", 4.50);
        student1.subjectGrade("Geography", 6.00);

        System.out.println("---------------------------------------");

        Student student2 = new Student("Lilqna", "Female", 41351, 10, 14);
        student2.StudentInfo();
        student2.subjectGrade("Math", 5.00);
        student2.subjectGrade("Geography", 5.50);

        System.out.println("---------------------------------------");
        highestGrade(student1, student2);
        System.out.println("---------------------------------------");
        lowestGrade(student1, student2);
        System.out.println("---------------------------------------");
    }
}
