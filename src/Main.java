public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.title = "The Odyssey";
        book1.author = "Homer";

        book2.title = "The Joyous Science";
        book2.author = "Nietzsche";

        book1.read();
        book2.read();


    }
}

class Book {
    String title;
    String author;

    void read() {
        System.out.println("You are currently reading: " + title + " by " + author + ".");
    }
}