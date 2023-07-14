package Day5;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
    public static void showInfo(List<Person> dataStructure){
        for(Person person : dataStructure){
            System.out.println(person);
        }
    }

    public static Student getClassStudentWithHighestGrade(List<Person> dataStructure, String subject){
        Student studentWithHighestGrade = null;
        double highestGrade = 2.00;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGrade().containsKey(subject)) {
                    double grade = student.getGrade().get(subject);
                    if(grade > highestGrade){
                        studentWithHighestGrade = student;
                        highestGrade = grade;
                    }
                }
            }
        }
        return studentWithHighestGrade;
    }
    public static Student getClassStudentWithLowestGrade(List<Person> dataStructure, String subject) {
        double lowestGrade = 6.00;
        Student studentWithLowestGrade = null;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGrade().containsKey(subject)) {
                    double grade = student.getGrade().get(subject);
                    if (grade < lowestGrade) {
                        studentWithLowestGrade = student;
                        lowestGrade = grade;
                    }
                }
            }
        }
        return studentWithLowestGrade;
    }
    public static double averageGrade(int totalSubjects, double totalGrades) {
        return totalGrades / totalSubjects;
    }

    public static double getAverageGrade(Student student) {
        double totalGrades = 0.0;
        int totalSubjects = student.getGrade().size();
        for (double grade : student.getGrade().values()) {
            totalGrades += grade;
        }
        return averageGrade(totalSubjects, totalGrades);
    }

    public static double averageClassGrade(List<Person> dataStructure){
        double totalGrades = 0.0;
        int studentCount = 0;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                totalGrades += getAverageGrade(student);
                studentCount++;
            }
        }
        return averageGrade(studentCount, totalGrades);
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

    public static String highestGradeSubject(Student student) {
        double highestGrade = 2.0;
        String subjectWithHighestGrade = null;
        for (Map.Entry<String, Double> entry : student.getGrade().entrySet()) {
            String subject = entry.getKey();
            double grade = entry.getValue();
            if (grade > highestGrade) {
                highestGrade = grade;
                subjectWithHighestGrade = subject;
            }
        }
        return subjectWithHighestGrade;
    }

    public static double averageSalary(Teacher teacher1, Teacher teacher2, Teacher teacher3) {
        double result = (teacher1.salary + teacher2.salary + teacher3.salary)/3;
        return result;
    }

    public static void main(String[] args) {
        List<Person> People = new ArrayList<>();

        Student student1 = new Student("Dimitar", "Male", 19480, 10, 10);
        student1.setGrade(5.50, "Geography");
        student1.setGrade(4.20, "Chemistry");
        student1.setGrade(6.00, "PE");
        student1.setGrade(3.50, "Math");

        Student student2 = new Student("Lilqna", "Female", 10145, 13, 10);
        student2.setGrade(5.00, "Geography");
        student2.setGrade(5.20, "Chemistry");
        student2.setGrade(6.00, "PE");
        student2.setGrade(4.70, "Math");

        Student student3 = new Student("Gumzata", "Male", 51230, 4, 11);
        student3.setGrade(6.00, "Geography");
        student3.setGrade(3.20, "Chemistry");
        student3.setGrade(5.50, "PE");
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

        showInfo(People);
        System.out.println("----------------------------");

        Student highestGrade = getClassStudentWithHighestGrade(People, "Math");
        System.out.println("The student with the highest grade in Math is: " + highestGrade.getName());
        System.out.println("----------------------------");

        Student highestGrade2 = getClassStudentWithHighestGrade(People, "Chemistry");
        System.out.println("The student with the highest grade in Chemistry is " + highestGrade2.getName());
        System.out.println("----------------------------");

        Student highestGrade3 = getClassStudentWithHighestGrade(People, "Geography");
        System.out.println("The student with the highest grade in Geography is " + highestGrade3.getName());
        System.out.println("----------------------------");

        Student highestGrade4 = getClassStudentWithHighestGrade(People, "PE");
        System.out.println("The student with the highest grade in PE is " + highestGrade4.getName());
        System.out.println("----------------------------");

        Student lowestGrade1 = getClassStudentWithLowestGrade(People, "Math");
        System.out.println("The student with the lowest grade in Math is: " + lowestGrade1.getName());
        System.out.println("----------------------------");

        Student lowestGrade2 = getClassStudentWithLowestGrade(People, "Chemistry");
        System.out.println("The student with the lowest grade in Chemistry is " + lowestGrade2.getName());
        System.out.println("----------------------------");

        Student lowestGrade3 = getClassStudentWithLowestGrade(People, "Geography");
        System.out.println("The student with the lowest grade in Geography is " + lowestGrade3.getName());
        System.out.println("----------------------------");

        Student lowestGrade4 = getClassStudentWithLowestGrade(People, "PE");
        System.out.println("The student with the lowest grade in PE is " + lowestGrade4.getName());
        System.out.println("----------------------------");

        double avgSalary = averageSalary(teacher1, teacher2, teacher3);
        System.out.println("The teacher average salary is: " + avgSalary);
        System.out.println("----------------------------");

        double averageGradeStudent1 = getAverageGrade(student1);
        System.out.println(student1.getName() + "'s average grade is " + (float) averageGradeStudent1);
        System.out.println("----------------------------");

        double averageGradeStudent2 = getAverageGrade(student2);
        System.out.println(student2.getName() + "'s average grade is " + (float) averageGradeStudent2);
        System.out.println("----------------------------");

        double averageGradeStudent3 = getAverageGrade(student3);
        System.out.println(student3.getName() + "'s average grade is " + (float) averageGradeStudent3);
        System.out.println("----------------------------");

        double averageGradeClass = averageClassGrade(People);
        System.out.println("The average grade of the class is " + averageGradeClass);
        System.out.println("----------------------------");

        String subjectHighestGradeStudent1 = highestGradeSubject(student1);
        System.out.println(student1.getName() + " has the highest grade in " + subjectHighestGradeStudent1);
        System.out.println("----------------------------");

        String subjectHighestGradeStudent2 = highestGradeSubject(student2);
        System.out.println(student2.getName() + " has the highest grade in: " + subjectHighestGradeStudent2);
        System.out.println("----------------------------");

        String subjectHighestGradeStudent3 = highestGradeSubject(student3);
        System.out.println(student3.getName() + " has the highest grade in: " + subjectHighestGradeStudent3);
        System.out.println("----------------------------");

        Teacher teacherHighestGrades = getTeacherWithHighestGrades(People);
        System.out.println("The teacher who gives the highest grades " + teacherHighestGrades.getName());
        System.out.println("----------------------------");

    }
}
