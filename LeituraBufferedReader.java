import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            FileReader arq = new FileReader("teste.txt");
            reader = new BufferedReader(arq);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}