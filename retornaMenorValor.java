package methodo;

public class retornaMenorValor {

	private int valor1, valor2, valor3, menorValor;
	private int[] vetorCresc;

	public int calculaMenorValor(int valor1, int valor2, int valor3) {

		if ((valor1 < valor2) && (valor1 < valor3)) {

			menorValor = valor1;
		}
		if ((valor2 < valor1) && (valor1 < valor3)) {

			menorValor = valor2;
		}
		if ((valor3 < valor2) && (valor3 < valor1)) {

			menorValor = valor3;
		}

		return menorValor;
	}
	
	public int[] ordenaCrescente(int valor1, int valor2, int valor3){
		
		int temp;
		
		//essa parte nao leva em consideracao que o valor do vetor pode mudar
		valor1 = vetorCresc[0];
		valor2 = vetorCresc[1];
		valor3 = vetorCresc[2];
		
		return vetorCresc;
	}
}
