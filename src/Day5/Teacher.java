package Day5;

import java.util.List;

public class Teacher extends Person{
    String school;
    private List<String> subjects;
    double salary;

    public Teacher(String name, String gender, int id, String school, List<String> subjects, double salary){
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public List<String> getSubjects(){
        return subjects;
    }

    public void getSubjects(List<String> subjects){
        this.subjects = subjects;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(){
        if(salary < 400) {
            throw new IllegalArgumentException("Below minimum salary !");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "School: " + getSchool() + '\'' +
                ", Subject: =" + getSubjects() +
                ", Salary: " + getSalary() +
                ", Name: " + getName() + '\'' +
                ", Gender: " + getGender() + '\'' +
                ", ID: " + getID() +
                '}';
    }
}
