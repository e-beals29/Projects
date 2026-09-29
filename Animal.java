
/**
 * Elizabeth Beals
 * Sep 28, 2026
 */

public class Animal
{
    private String species;

    // Default constructor
    public Animal() {
        this.species = ""; // Initializes species as an empty string
    }

    // Custom constructor with parameters
    public Animal(String newSpecies) {
        this.species = newSpecies;
    }

    // Setter method
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    // Getter method 
    public String getSpecies() {
        return this.species;
    }

    // toString method
    @Override
    public String toString() {
        return "Species: " + this.species;
    }
}