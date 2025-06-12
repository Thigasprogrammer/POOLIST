import java.io.File;
import java.io.IOException;

public class CriarDeletar {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.print("Arquivo criado: ");
                System.out.println(file.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }

            if (file.delete()) {
                System.out.println("Arquivo deletado.");
            } else {
                System.out.println("Falha ao deletar o arquivo.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}