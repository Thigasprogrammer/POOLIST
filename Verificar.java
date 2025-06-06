import java.util.HashMap; 
public class Verificar { 
	public static void main(String[] args) { 
		// Criando um HashMap 
		HashMap<String, Integer> estoque new HashMap<>(); 
		// Adicionando elementos 
		estoque.put("Maça", 50); 
		estoque.put("Banana", 30); 
		estoque.put("Laranja", 20);
		
		boolean existe estoque.containsKey("Laranja"); 
		System.out.println("0 estoque contém Laranja? " + existe);

		boolean existe estoque.containsKey("Pera"); 
		System.out.println("0 estoque contém Pera? " + existe);
	}
}