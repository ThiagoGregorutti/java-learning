public class Main {
    public static void main(String[] args) {
        // Primitive variables
        int temperature = 10;
        boolean raining = true;
        int hour = 12;


        if (hour < 12) {
            System.out.println("Good morning!");
        }
        else if (hour < 18) {
            System.out.println("Good afternoon!");
        }
        else {
            System.out.println("Good evening!");
        }


        if (temperature < 0) {
            System.out.println("It's freezing.");
        } else if (temperature < 15) {
            System.out.println("It's cold.");
        } else if (temperature < 25) {
            System.out.println("It's warm.");
        } else {
            System.out.println("It's hot.");
        }


        if (raining) {
            System.out.println("Don't forget your umbrella.");
        }
    }
}

