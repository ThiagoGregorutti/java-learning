public class Main {
    public static void main(String[] args) {
        // Create two objects
        God god1 = new God();
        God god2 = new God();

        // Set their attributes
        god1.name = "Zeus";
        god1.lives = 2;

        god2.name = "Athenas";
        god2.lives = 7;

        god1.heck();
        god2.heck();

    }
}

class God {
    String name;
    int lives;

    void heck() {
        System.out.println(name + " says: Heck! I have " + lives + " left.");
    }
}
