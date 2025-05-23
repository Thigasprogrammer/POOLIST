import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		ArrayList<Circulo> lst_circulos = new ArrayList<Circulo>();


		System.out.print("digite o valor do raio do circulo, caso queira finalizar digite -1: ");
		double raio = teclado.nextDouble();

		while(raio != -1){
			System.out.print("digite o valor da coordenada x do centro do circulo: ");
			double x = teclado.nextDouble();
			System.out.print("digite o valor da coordenada y do centro do circulo: ");
			double y = teclado.nextDouble();
			System.out.println();

			Ponto coord_centro = new Ponto(x, y); //define o objeto ponto, o centro desse circulo em questão
			Circulo circulo = new Circulo(raio, coord_centro);
			lst_circulos.add(circulo);

			System.out.print("digite o valor do raio do circulo, caso queira finalizar digite -1: ");
			raio = teclado.nextDouble();
		}//while

			for(Circulo mostrar : lst_circulos){
				System.out.print(mostrar);
			}
		teclado.close();


	}
}