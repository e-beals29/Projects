
/**
 *Elizabeth Beals
 *Oct 22, 2026
 */
import java.util.ArrayList;

public class Asn5
{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Initial Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.println("\nInitial Numbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        System.out.println("\nPerforming Operations...");
        
        fruits.remove(1);
        System.out.println("Removed the element at index 1 from fruits.");
        
        numbers.set(0, 99);
        System.out.println("Updated the element at index 0 in numbers to 99");
        
        System.out.println("\nUpdated Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nUpdated Numbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}