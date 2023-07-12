package Day5;

public class Teacher extends Person {
    String name;
    String gender;
    int ID;
    String school;
    String subject;
    double salary;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender(String gender) {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female")){
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Wrong value!");
        }
    }

    public int getID(int id) {
        return id;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public String getSchool(String school) {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubject(String subject) {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary(double salary) {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary < 400) {
            throw new IllegalArgumentException("Below minimum salary !");
        }
        this.salary = salary;
    }

    public Teacher(String name, String gender, int id, String school, String subject, double salary) {
    setName(name);
    setGender(gender);
    setID(id);
    setSchool(school);
    setSubject(subject);
    setSalary(salary);
    }
    public void TeacherInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Class: " + this.ID);
        System.out.println("Number in the class: " + this.school);
        System.out.println("Grade: " + this.subject);
        System.out.println("Salary: " + this.salary);
    }

}
