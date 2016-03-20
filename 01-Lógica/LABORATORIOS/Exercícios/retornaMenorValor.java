package Exerc3;

public class retornaMenorValor {

	private int valor1, valor2, valor3, menorValor;
	private int vetor1[] = new int[3];

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

	public int[] ordenaCrescente(int valor1, int valor2, int valor3) {

		int temp;

		// essa parte nao leva em consideracao que o valor do vetor pode mudar
		vetor1[0] = valor1;
		vetor1[1] = valor2;
		vetor1[2] = valor3;

		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 2; x++) {

				if (vetor1[x + 1] < vetor1[x]) {

					temp = vetor1[x];
					vetor1[x] = vetor1[x + 1];
					vetor1[x + 1] = temp;

				}
			}
		}
		return vetor1;
	}
}
