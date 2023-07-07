package Day5;

public class Teacher {
    String name;
    String gender;
    int ID;
    String school;
    String subject;
    double salary;
    public void TeacherInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Class: " + this.ID);
        System.out.println("Number in the class: " + this.school);
        System.out.println("Grade: " + this.subject);
        System.out.println("Salary: " + this.salary);
    }

}
