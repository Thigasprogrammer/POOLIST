import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        // Criando uma lista de strings
        ArrayList<String> frutas = new ArrayList<String>();

        // Adicionando elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        //utiliza-se remove para remover um item da lista em determinada posição
        frutas.remove(1);

        // Exibindo os elementos
        System.out.println(frutas);
    }
}