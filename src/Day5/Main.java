package Day5;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
    public static void dataStructure(List<Person> dataStructure){
        for(Person person : dataStructure){
            System.out.println(person);
            System.out.println();
        }
    }
    public static Student getStudentHighestGrade(Student student, double grade, double currentHighestGrade){
        Student temporary = null;
        if(grade > currentHighestGrade){
            currentHighestGrade = grade;
            temporary = student;
        }
        return temporary;
    }
    public static Student getStudentLowestGrade(Student student, double grade, double currentLowestGrade){
        Student temporary = null;
        if(grade < currentLowestGrade){
            currentLowestGrade = grade;
            temporary = student;
        }
        return temporary;
    }
    public static Student getClassStudentWithHighestGrade(List<Person> dataStructure, String subject){
        Student studentWithHighestGrade = null;
        double highestGrade = 2.00;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGrade().containsKey(subject)) {
                    double grade = student.getGrade().get(subject);
                    studentWithHighestGrade = getStudentHighestGrade(student, grade, highestGrade);
                }
            }
        }
        return studentWithHighestGrade;
    }
    public Student getClassStudentWithLowestGrade(List<Person> dataStructure, String subject){
        Student studentWithLowestGrade = null;
        double lowestGrade = 6.00;
        for(Person person: dataStructure){
            Student student = (Student) person;
            if(student.getGrade().containsKey(subject)){
                double grade = student.getGrade().get(subject);
                studentWithLowestGrade = getStudentLowestGrade(student, grade, lowestGrade);
            }
        }
        return studentWithLowestGrade;
    }
    public static void findTeachers(Map<Teacher, Double> teacherGrades, List<Person> dataStructure) {
        for (Person person : dataStructure) {
            if (person instanceof Teacher) {
                teacherGrades.put((Teacher) person, 0.0);
            }
        }
    }
    public static void teacherSignedGrades(Map<Teacher, Double> teacherGrades, List<Person> dataStructure) {
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                for (Map.Entry<Teacher, Double> entry : teacherGrades.entrySet()) {
                    Teacher teacher = entry.getKey();
                    double totalGrade = entry.getValue() + student.getGrade().values().stream().mapToDouble(Double::doubleValue).sum();
                    teacherGrades.put(teacher, totalGrade);
                }
            }
        }
    }
    public static Teacher getTeacherWithHighestGrades(List<Person> dataStructure) {
        Map<Teacher, Double> teacherGrades = new HashMap<>();

        findTeachers(teacherGrades, dataStructure);
        teacherSignedGrades(teacherGrades, dataStructure);
        return getTeacherHighestGrade(teacherGrades, dataStructure);
    }


    public static Teacher getTeacherHighestGrade(Map<Teacher, Double> teacherGrades, List<Person> dataStructure) {
        double highestGrade = 2.00;
        Teacher teacherWithHighestGrades = null;
        for (Map.Entry<Teacher, Double> entry : teacherGrades.entrySet()) {
            Teacher teacher = entry.getKey();
            double grade = entry.getValue();
            if (grade > highestGrade) {
                highestGrade = grade;
                teacherWithHighestGrades = teacher;
            }
        }
        return teacherWithHighestGrades;
    }
    public static Teacher getTeacherLowestGrade(Map<Teacher, Double> teacherGrades, List<Person> dataStructure) {
        double lowestGrade = 6.00;
        Teacher teacherWithLowestGrades = null;
        for (Map.Entry<Teacher, Double> entry : teacherGrades.entrySet()) {
            Teacher teacher = entry.getKey();
            double grade = entry.getValue();
            if (grade < lowestGrade) {
                lowestGrade = grade;
                teacherWithLowestGrades = teacher;
            }
        }
        return teacherWithLowestGrades;
    }
    public static Teacher getTeacherWithTheHighestGrades(List<Person> dataStructure) {
        Map<Teacher, Double> teacherGrades = new HashMap<>();

        findTeachers(teacherGrades, dataStructure);
        getTeacherHighestGrade(teacherGrades, dataStructure);
        return getTeacherHighestGrade(teacherGrades, dataStructure);
    }

    public static double averageSalary(Teacher teacher1, Teacher teacher2, Teacher teacher3) {
        double result = (teacher1.salary + teacher2.salary + teacher3.salary)/3;
        return result;
    }

    public static void main(String[] args) {
        List<Person> People = new ArrayList<>();

        Student student1 = new Student("Dimitar", "Male", 19480, 10, 10);
        student1.setGrade(6.00, "Geography");
        student1.setGrade(4.20, "Chemistry");
        student1.setGrade(6.00, "PE");
        student1.setGrade(3.50, "Math");

        Student student2 = new Student("Lilqna", "Female", 10145, 13, 10);
        student2.setGrade(5.00, "Geography");
        student2.setGrade(5.20, "Chemistry");
        student2.setGrade(6.00, "PE");
        student2.setGrade(4.50, "Math");

        Student student3 = new Student("Gumzata", "Male", 51230, 4, 11);
        student3.setGrade(6.00, "Geography");
        student3.setGrade(3.20, "Chemistry");
        student3.setGrade(5.00, "PE");
        student3.setGrade(4.50, "Math");

        Teacher teacher1 = new Teacher("Naiden", "Male", 14123, "PGEE", Arrays.asList("Geography"), 2500);
        Teacher teacher2 = new Teacher("Boris", "Male", 15123, "PGEE", Arrays.asList("PE", "Math"), 2600);
        Teacher teacher3 = new Teacher("Gergana", "Female", 11032, "PGEE", Arrays.asList("Chemistry"), 2300);

        People.add(student1);
        People.add(student2);
        People.add(student3);
        People.add(teacher1);
        People.add(teacher2);
        People.add(teacher3);

        dataStructure(People);

        Student highestGrade = getClassStudentWithHighestGrade(People, "Math");
        System.out.println("The student with the highest grade in Math is: " + highestGrade.getName());
        Student highestGrade2 = getClassStudentWithHighestGrade(People, "Chemistry");
        System.out.println("The student with the highest grade in Chemistry is: " + highestGrade2.getName());
        Student highestGrade3 = getClassStudentWithHighestGrade(People, "Geography");
        System.out.println("The student with the highest grade in Geography is: " + highestGrade3.getName());
        Student highestGrade4 = getClassStudentWithHighestGrade(People, "PE");
        System.out.println("The student with the highest grade in PE is: " + highestGrade4.getName());

        double avgSalary = averageSalary(teacher1, teacher2, teacher3);
        System.out.print("The teacher average salary is: " + avgSalary);
    }
}
