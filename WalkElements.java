import java.util.ArrayList;

public class WalkElements {
    public static void main(String[] args) {
        // Criando uma lista de strings
        ArrayList<String> frutas = new ArrayList<String>();

        // Adicionando elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Exibindo os elementos
        for(String fruta : frutas){
            System.out.print(fruta);
        }
    }
}