
/**
 * Elizabeth Beals
 * Sep 10, 2026
 */

public class Pet
{ 
    // Private data fields
    private String name;
    private String type;
    private int age;
    
    // Default Constructor
    public Pet() {
        this.setType("Animal");
        this.setName("Pet Name");
        this.setAge(1);
    }
    
    // Custom Constructor with 3 parameters
    public Pet(String type, String name, int age) {
        this.setType(type);
        this.setName(name);
        this.setAge(age);
    }
    
    // Public set or mutator method
    public void setName(String Name) {
        this.name = Name;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Public get or accessor method
    public String fetchName() {
        return this.name;
    }
    
    public String fetchType() {
        return this.type;
    }
    
    public int fetchAge() {
        return this.age;
    }
    
    // Custom public method: speak()
    public String speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl"; 
        }
    }
    
    //Public toString method
    @Override
    public String toString() {
        String result = "Pet information:\n";
        result += "Type: " + this.type + "\n";
        result += "Name: " + this.name + "\n";
        result += "Sound: " + this.speak() + "\n";
        result += "Age: " + this.age + "\n";
        return result;
    }   
}