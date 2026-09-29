
/**
 * Runner for Animal.java
 *
 * Elizabeth Beals
 * Sep 28, 2026
 */
public class Runner3
{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setSpecies("Dog");
        System.out.println(a1.toString());

        Animal a2 = new Animal("Cat");
        System.out.println(a2.toString());
    }
}