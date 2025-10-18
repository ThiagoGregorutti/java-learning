package folder_example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Odyssey";
        book1.author = "Homer";

        Book book2 = new Book();
        book2.title = "The Joyous Science";
        book2.author = "Nietzsche";

        book1.read();
        book2.read();
    }
}
