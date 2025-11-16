package folder_example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description):");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (player)");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing:");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I joined a " + adjective1 + " party finder.");
        System.out.println("There, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        scanner.close();
    }
}