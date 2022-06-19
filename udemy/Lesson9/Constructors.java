package udemy.Lesson9;

public class Constructors {
   // Class Properties
    private String name;
    private String lastName;
    private int age;

    // Setting default values of class properties
    // by creating method with same name as a class
    // Constructors doesn't have return type
    public Constructors(){
        name = "Fred";
        lastName = "Sharapov";
        age = 39;
    }

    public Constructors(String nameC, String lastNameC, int ageC){
        name = nameC;
        lastName = lastNameC;
        age = ageC;
    }


}
