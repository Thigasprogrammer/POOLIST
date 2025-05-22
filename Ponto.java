import java.lang.Math;

private class Ponto{
	double x;
	double y;

	private Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}

	private double distancia(Ponto p2){
		double distancia = Math.sqrt(Math.pow((x - p2.x), 2) + Math.pow((y - p2.y), 2));
		return Math.round(distancia);
	}

	private String toString(){
		String s = "coordenada x: " + x + " e coordenada y: " + y;
		return s;
	}

}