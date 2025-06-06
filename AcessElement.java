import java.util.HashMap; 
public class AcessElement { 
	public static void main(String[] args) { 
		// Criando um HashMap 
		HashMap<String, Integer> estoque new HashMap<>(); 
		// Adicionando elementos 
		estoque.put("Maça", 50); 
		estoque.put("Banana", 30); 
		estoque.put("Laranja", 20);
		// Exibindo o HashMap
		int quantidade estoque.get("Banana"); // Obtém o valor associado à chave "Banana 
		System.out.println("Quantidade de Bananas: " + quantidade);
	}
}