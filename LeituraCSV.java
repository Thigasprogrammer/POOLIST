import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraCSV {
    public static void main(String[] args) {
        String fileName = "pessoa.csv";
        List<Pessoa> pessoas = new ArrayList<>();
        BufferedReader reader;

        try {
            FileReader arq = new FileReader(fileName);
            reader = new BufferedReader(arq);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String nome = data[0].trim();
                int idade = Integer.parseInt(data[1].trim());
                pessoas.add(new Pessoa(nome, idade));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}

