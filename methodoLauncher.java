package methodo;

import java.util.Scanner;

public class methodoLauncher {

	public static void main(String[] args) {

		int[] vetor1 = new int[3];
		
		System.out.println("Digite o valor 1");
		Scanner scanner = new Scanner(System.in);
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2");
		Scanner scanner2 = new Scanner(System.in);
		int valor2 = scanner.nextInt();
		
		System.out.println("Digite o valor 3");
		Scanner scanner3 = new Scanner(System.in);
		int valor3 = scanner.nextInt();
		
		retornaMenorValor calculo1 = new retornaMenorValor();
		vetor1 = calculo1.ordenaCrescente(valor1,valor2,valor3);
		
		System.out.println("O primeiro valor digitado foi "+valor1);
		System.out.println("O segundo valor digitado foi "+valor2);
		System.out.println("O terceiro valor digitado foi "+valor3);
		
		System.out.println("O menor valor digitado foi "+calculo1.calculaMenorValor(valor1,valor2,valor3));
		System.out.println("A seguencia em ordem crescente e "+vetor1[0]);
	}
		

}
