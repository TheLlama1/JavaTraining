package Day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Martin
public class Main {

    public static void highestGrade(Student student1, Student student2) {
        if (student1.getSubjectGrade() < student2.getSubjectGrade()) {
            System.out.println("The person with the highest grade in the subject is " + student1.getName());
        } else {
            System.out.println("The person with the highest grade in the subject is " + student2.getName());
        }
    }
        public static void lowestGrade (Student student1, Student student2){
            if (student1.getSubjectGrade() < student2.getSubjectGrade()) {
                System.out.println("The person with the lowest grade in the subject is " + student2.getName());
            } else {
                System.out.println("The person with the lowest grade in the subject is " + student1.getName());
            }
        }
    public static void averageSalary(Teacher teacher1, Teacher teacher2){
        System.out.println((teacher1.salary + teacher2.salary)/2);
    }
    public static void averageGrade(Student student1, Student student2){
     double result =  student1.grade;
     double result2 = student2.grade;
     System.out.println("Dimitar average grade:" + result);
     System.out.println("---------------------------------------");
     System.out.println("Lilqna average grade:" + result2);
    }
    public static void averageClassGrade(Student student1, Student student2){
        System.out.println((student1.grade + student2.grade)/2);
    }
    public static void subjectHighestGrade(Student student1, Student student2){
    student1.getSubjectGrade();
    student2.getSubjectGrade();
    if(student1.getSubjectGrade() > student2.getSubjectGrade()){
        System.out.println("Dimitar has the highest grade in the subject!");
    } else {
        System.out.print("Lilqna has the highest grade in the subject!");
    }
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

        Student student1 = new Student("Dimitar", "Male", 10412, 10, 9, 4.75);
        student1.StudentInfo();
        List<Person> dataStructure = new ArrayList<>();
        student1.subjectGrade("Math", 3.50);
        student1.subjectGrade("Geography", 6.00);

        System.out.println("---------------------------------------");

        Student student2 = new Student("Lilqna", "Female", 41351, 10, 14, 5.25);
        student2.StudentInfo();
        student2.subjectGrade("Math", 5.00);
        student2.subjectGrade("Geography", 5.50);

        System.out.println("---------------------------------------");
        highestGrade(student1, student2);
        System.out.println("---------------------------------------");
        lowestGrade(student1, student2);
        System.out.println("---------------------------------------");
        averageClassGrade(student1, student2);
        System.out.println("---------------------------------------");
        averageGrade(student1, student2);
        System.out.println("---------------------------------------");
        subjectHighestGrade(student1, student2);

        dataStructure.add(student1);
        dataStructure.add(student2);
        dataStructure.add(teacher1);
        dataStructure.add(teacher2);
    }
}