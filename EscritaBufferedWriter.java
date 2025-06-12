import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaBufferedWriter {
    public static void main(String[] args) {
        BufferedWriter writer;
        try {
            FileWriter arq = new FileWriter("saida.txt");
            writer = new BufferedWriter(arq);
            writer.write("Primeira linha");
            writer.newLine();
            writer.write("Segunda linha");
            writer.close();
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
