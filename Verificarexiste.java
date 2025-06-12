import java.io.File; 
public class Verificarexiste { 
	public static void main(String[] args) { 
		File file = new File("example.txt"); 
		if (file.exists()) { 
			System.out.println("O arquivo existe."); 
		} else { 
			System.out.println("Arquivo não encontrado."); 
		} 
	} 
}