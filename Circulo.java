// Arquivo Circulo.java
import java.lang.Math;
public class Circulo {
	double raio;
	Ponto centro;

	Circulo(double r, Ponto c){
		raio = r;
		centro = c;
	}
	double diametro(){
		return 2 * raio;
	}
	double area(){
		return raio * raio * Math.PI;
	}
	double perimetro(){
		return 2 * raio * Math.PI;
	}
	public String toString(){
		return "Circulo: \n" +
				"raio: " + raio + "\n" +
				"area: " + area() + "\n" +
				"perimetro: " + perimetro() + "\n" +
				"centro: " + centro +
				"\n";
	}
}