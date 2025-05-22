import java.util.ArrayList;

public class Get {
    public static void main(String[] args) {
        // Criando uma lista de strings
        ArrayList<String> frutas = new ArrayList<String>();

        // Adicionando elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        //Usa-se get para pegar um item em uma lista
        String primeirafruta = frutas.get(0);

        // Exibindo os elementos
        System.out.println(primeirafruta);
    }
}