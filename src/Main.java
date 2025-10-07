import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean messiScores = true;
        int goalCount = 0;

        while(messiScores) {
            goalCount++;
            System.out.println("Messi goals count: " + goalCount);
            if (goalCount == 3) {
                messiScores = false;
            }
        }

    }
}

/* int[] numbers = {10, 20, 30};

        for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);

########################################################

            for (int i = 0; i <= 5; i++) {
        System.out.println(i);


 */
