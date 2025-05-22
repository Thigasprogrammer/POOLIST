// Arquivo Circulo.java
import java.lang.Math;
private class Circulo {
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
	System.out.print("raio: " + raio);
	System.out.print("area: " + area());
	System.out.print("perimetro: " + perimetro()); 
	}
}