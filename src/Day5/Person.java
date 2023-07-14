package Day5;

public class Person {
    String name;
    String gender;
    int ID;

    public Person(String name, String gender, int id) {
        this.name = name;
        this.gender = gender;
        this.ID = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setString(String gender){
        if(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female")){
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Wrong value!");
        }
    }
    public int getID(){
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }
}
