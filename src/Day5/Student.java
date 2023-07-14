package Day5;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    int klas;
    int numberInClass;
    private final Map<String, Double> grade = new HashMap<>();
    public Student(String name, String gender, int id, int numInClass, int klas){
        super(name, gender, id);
        this.klas = klas;
        this.numberInClass = numInClass;
    }
    public int getKlas(){
        return klas;
    }
    public void setKlas(int clas){
        this.klas = clas;
    }
    public int getNumberInClass(){
        return numberInClass;
    }
    public void setNumberInClass(int numInClass){
         this.numberInClass = numInClass;
    }
    public Map<String, Double> getGrade() {
        return grade;
    }
    public void setGrade(double grade, String nameOfTheSubject){
        this.grade.put(nameOfTheSubject, grade);
    }
    @Override
    public String toString() {
        return "Student{" +
                "Class: " + getKlas() +
                ", Number in class: " + getNumberInClass() +
                ", Grade: " + getGrade() +
                ", Name: " + getName() + '\'' +
                ", Gender: " + getGender() + '\'' +
                ", ID: " + getID() +
                '}';
    }
}
