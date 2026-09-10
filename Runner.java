
/**
 * Elizabeth Beals
 * Sep 10, 2026
 */

import java.util.Scanner;

public class Runner
{
    // Main
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());
    
        Pet pet2 = new Pet("Dog", "Big Ol Beef", 4);
        System.out.println(pet2.toString());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter animal type:");
        String userType = input.nextLine();

        System.out.println("Enter animal name:");
        String userName = input.nextLine();

        System.out.println("Enter animal age:");
        int userAge = input.nextInt();
        System.out.println();

        Pet pet3 = new Pet(userType, userName, userAge);
        System.out.println(pet3.toString());

        input.close();
    }
}