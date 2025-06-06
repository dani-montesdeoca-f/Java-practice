
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals (Object compared){
        // if variables are located in the same position
        if(this == compared){
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        
        // convert the object into a Person object
        Person comparedPerson = (Person) compared;
        
        // check for the values quality
         if (this.name.equals(comparedPerson.name) &&
            this.birthday.equals(comparedPerson.birthday) &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height) {
             
                return true;
        }
        
        return false;
    }
}
