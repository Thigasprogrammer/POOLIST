import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        // Criando uma lista de strings
        ArrayList<String> frutas = new ArrayList<String>();

        // Adicionando elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        //contains verifica se contém um objeto específico na lista
        boolean existe1 = frutas.contains("pera");
        boolean existe2 = frutas.contains("Laranja");


        // Exibindo os elementos
        System.out.println("Existe a fruta Pera na lista? " + existe1);
        System.out.println("Existe a fruta Laranja na lista? " + existe2);
    }
}