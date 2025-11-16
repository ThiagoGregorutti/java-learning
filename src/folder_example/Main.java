package folder_example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price = 99.99;
        int quantity;
        char currency = 'G';
        double total;


        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("How many would you like?");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.print("\nThe total for " + quantity + " " + item + " would be " + total + currency);

        scanner.close();
    }
}