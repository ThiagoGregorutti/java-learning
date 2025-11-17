package folder_example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("side A in cm: ");
        a = scanner.nextDouble();

        System.out.print("side B in cm: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("side C is " + c + "cm");


        scanner.close();
    }
}