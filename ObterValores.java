import java.util.HashMap; 
public class ObterValores { 
	public static void main(String[] args) { 
		// Criando um HashMap 
		HashMap<String, Integer> estoque new HashMap<>(); 
		// Adicionando elementos 
		estoque.put("Maça", 50); 
		estoque.put("Banana", 30); 
		estoque.put("Laranja", 20);
		// Exibindo o HashMap
		System.out.println(estoque);

		System.out.println("Valores no estoque: " + estoque.values()); // Obtem todos os valores
	}
}