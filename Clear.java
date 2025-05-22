import java.util.ArrayList;

public class Clear {
    public static void main(String[] args) {
        // Criando uma lista de strings
        ArrayList<String> frutas = new ArrayList<String>();

        // Adicionando elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Exibindo os elementos
        System.out.println("lista cheia " + frutas);
        frutas.clear();
        System.out.println("lista vazia " + frutas);

    }
}