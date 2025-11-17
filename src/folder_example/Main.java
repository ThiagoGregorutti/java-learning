package folder_example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        boolean number;

        number = random.nextBoolean();

        if (number){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

    }
}