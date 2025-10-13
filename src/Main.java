public class Main {
    public static void main(String[] args) {
        // Create two objects
        Player player1 = new Player();
        Player player2 = new Player();

        // Set their attributes
        player1.name = "Apollo";
        player1.score = 888;

        player2.name = "Dionysus";
        player2.score = 666;

        player1.showScore();
        player2.showScore();
    }
}


class Player {
    String name;
    int score;

    void showScore() {
        System.out.println(name + " has a score of " + score);
    }
}
