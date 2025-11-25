package folder_example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        int height;

        System.out.print("What is your age?");
        age = scanner.nextInt();

        System.out.print("What is your height?");
        height = scanner.nextInt();

        if(age >= 18) {
            if(height >= 160) {
                System.out.print("You can ride!");
            }
            else {
                System.out.print("You're old enough, but too short.");
            }
        } else {
            System.out.print("You're too young.");
        }

        scanner.close();
    }
}