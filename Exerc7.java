import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		
		String nome;
		double salario, salario_minimo,valor_reajuste = 0,salario_novo = 0;
		
		System.out.println("Digite o nome do funcionario");
		Scanner entrada1 = new Scanner(System.in);
		nome = entrada1.nextLine();
		
		System.out.println("Digite o valor do seu salario");
		Scanner entrada2 = new Scanner(System.in);
		salario = entrada1.nextDouble();
		
		System.out.println("Digite o valor do salario minimo");
		Scanner entrada3 = new Scanner(System.in);
		salario_minimo = entrada1.nextDouble();

		if(salario < salario_minimo*3){
			salario_novo = salario * 1.5;
			valor_reajuste = 50;
		}
		if(salario >= salario_minimo*3 && salario <= salario_minimo*10){
			salario_novo = salario * 1.2;
			valor_reajuste = 20;
		}
		if(salario >= salario_minimo*10 && salario <= salario_minimo*20){
			salario_novo = salario * 1.15;
			valor_reajuste = 15;
		}
		if(salario > salario_minimo*20){
			salario_novo = salario * 1.10;
			valor_reajuste = 10;
		}
		System.out.println("O novo salario de "+nome+" e R$"+salario_novo+" e seu reajuste foi de "+valor_reajuste+"%");
	}

}
