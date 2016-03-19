package methodo;

public class calculaArea {

	private double valorArea;
	
	
	public double calcularValorArea(double raio){
		
		valorArea = (3.14 * (raio*raio));
		
		System.out.println("O valor da area e: "+valorArea);

		return valorArea;
		
	}
}
