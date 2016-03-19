package methodo;

import java.util.Scanner;

public class mainLauncher {

	public static void main(String[] args) {

		System.out.println("Digite a quantidade de horas trabalhadas no mes");
		Scanner scanner = new Scanner(System.in);
		int hrsTrabalhadas = scanner.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada");
		Scanner scanner2 = new Scanner(System.in);
		int vlrHoraTrabalhada = scanner.nextInt();
		
		System.out.println("Digite um porcentual de desconto caso exista");
		Scanner scanner3 = new Scanner(System.in);
		int vlrDesconto = scanner.nextInt();
		
		calcularSalario calculo1 = new calcularSalario();
		
		System.out.println("O valor so salario bruto e "+calculo1.calculaSalarioBruto(hrsTrabalhadas, vlrHoraTrabalhada));
		System.out.println("O salario com desconto e "+calculo1.calculaTotalDesconto(vlrDesconto));
		System.out.println("O salario liquido e "+calculo1.calculaSalario());
	}

}
