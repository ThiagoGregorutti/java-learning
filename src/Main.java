import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Primitive variables
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Johan");
        nomes.add("Liebert");
        nomes.add("Lelouch");
        nomes.add("Lamperouge");
        nomes.add("Britannia");

        nomes.remove("johan");

        System.out.println(nomes.get(0));

    }
}

