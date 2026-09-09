
/**
 * 
 *
 * Elizabeth Beals
 * Sep 08, 2026
 */
public class Pet
{ 
    // Private data fields
    private String name;
    
    // Main
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());
        System.out.println();
        
        Pet myDog = new Pet();
        myDog.setName("Big Ol Beef");
        System.out.println(myDog.toString());
    }
    
    // Public Constructor
    public Pet() {
        this.setName("Pet Name");
    }
    
    
    // Public set or mutator method
    public void setName(String Name) {
        this.name = Name;
    }
    
    // Public get or accessor method
    public String fetchName() {
        return this.name;
    }
    
    //Public toString method
    @Override
    public String toString() {
        String result = "Pet information:\n";
        result += "Name: " + this.name;
        return result;
    }   
}