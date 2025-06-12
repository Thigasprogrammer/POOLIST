import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraScanner{
    public static void main(String[] args) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File("teste.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
