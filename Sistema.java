import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		ArrayList<Circulo> lst_circulos = new ArrayList<Circulo>();

		double raio;
		while(raio != -1){
			System.out.print("digite o valor da coordenada x do centro: ");
			double x = teclado.nextDouble();
			System.out.print("digite o valor da coordenada x do centro: ");
			double y = teclado.nextDouble();

			raio = teclado.nextDouble();

			

			Ponto coord_centro = new Ponto(x, y); //define o objeto ponto, o centro desse circulo em questão
			Circulo circulo = new Circulo(coord_centro, raio);

			lst_circulos.add(circulo);
		}//while

		for(Circulo mostrar : lst_circulos){
			System.out.print(mostrar);
		}


	}
}