import java.io.PrintWriter;
import java.io.IOException;

public class EscritaPrintWriter {
    public static void main(String[] args) {
        PrintWriter writer;
        try {
            writer = new PrintWriter("saida.txt");
            writer.println("Linha 1 usando PrintWriter.");
            writer.println("Linha 2 usando PrintWriter.");
            writer.close();
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
