import java.util.ArrayList;

public class Size {
    public static void main(String[] args) {
        // Criando uma lista de strings
        ArrayList<String> frutas = new ArrayList<String>();

        // Adicionando elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        int tamanho = frutas.size();

        // Exibindo os elementos
        System.out.println("Lista.size() verifica o tamanho da lista. o tamanho da lista frutas é: " + tamanho);
    }
}