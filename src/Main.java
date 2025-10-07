import java.util.ArrayList; // ✅ Add this line at the top

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors.get(0));
        System.out.println(colors.get(colors.size() - 1));
    }
}
