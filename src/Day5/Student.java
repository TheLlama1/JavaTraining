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
    public String setName(String name){
        return name;
    }
    public String getGender(String gender){
        return gender;
    }
    public String setGender(String gender){
        if(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female")){
            return gender;
        }else{
            throw new IllegalArgumentException("Wrong value!");
        }
    }
    public int getID(int id){
        return id;
    }
    public int setID(int id){
        return id;
    }
    public int getKlas(int clas){
        if(clas > 12 || clas < 1){
            throw new IllegalArgumentException("Wrong value!");
        }
            return clas;
    }
    public int getNumberInClass(int numInClass){
        return numInClass;
    }
    public int setNumInClass(int numInClass){
        if(numInClass < 1){
            throw new IllegalArgumentException("Wrong value!");
        }
        return numInClass;
    }
    public Student(String name, String gender, int id, int clas, int numInClass, double grade){
        this.name = name;
        this.gender = gender;
        this.ID = id;
        this.klas = clas;
        this.numberInClass = numInClass;

    }
    public void StudentInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("ID: " + this.ID);
        System.out.println("Class: " + this.klas);
        System.out.println("Number in the class: " + this.klas);
        System.out.println("Grade: " + this.grade);
    }




}
