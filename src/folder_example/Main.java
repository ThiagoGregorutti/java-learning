package folder_example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Iliad", "Homer");

        Book book2 = new Book("The Joyous Science", "Nietzsche");

        book1.read();
        book2.read();

        System.out.println(book1);
        System.out.println(book2);
    }
}
