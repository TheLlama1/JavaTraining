package Day5;

import java.util.SortedMap;
import java.util.Spliterator;

public class Student {
    String name;
    String gender;
    int ID;
    int klas;
    int numberInClass;
    double grade;


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
           if(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female")){
               this.gender = gender;
           }else{
               throw new IllegalArgumentException("Wrong value!");
           }
    }

    public int getID(){
        return ID;
    }

    public void setID(int id){
        this.ID = id;
    }

    public int getKlas(){
        return klas;
    }

    public void setKlas(int clas){
        if(clas > 12 || clas < 1){
            throw new IllegalArgumentException("Wrong value!");
        }
            this.klas = clas;
    }
    public int getNumberInClass(){
        return numberInClass;
    }
    public void setNumberInClass(int numInClass){
        if(numInClass < 1){
            throw new IllegalArgumentException("Wrong value!");
        }else{
            this.numberInClass = numInClass;
        }
    }

    public double getSubjectGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public void subjectGrade(String subject, double grade){
        System.out.print("Subject: " + subject + " Grade: " + grade + "\n");
    }

    public Student(String name, String gender, int id, int clas, int numInClass){
        setName(name);
        setGender(gender);
        setID(id);
        setKlas(clas);
        setNumberInClass(numInClass);
    }
    public void StudentInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("ID: " + this.ID);
        System.out.println("Class: " + this.klas);
        System.out.println("Number in the class: " + this.numberInClass);
    }
}
