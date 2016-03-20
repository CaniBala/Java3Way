import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {

		double valor1, valor2, resultado = 0;
		String operacao;
		
		System.out.println("Digite o primeiro valor:");
		Scanner entrada1 = new Scanner(System.in);
		valor1 = entrada1.nextInt();
		
		System.out.println("Digite o segundo valor:");
		Scanner entrada2 = new Scanner(System.in);
		valor2 = entrada2.nextInt();
		
		System.out.println("Digite a operacao desejada:");
		Scanner entrada3 = new Scanner(System.in);
		operacao = entrada3.nextLine();
		
		//String e uma classe e nao um objeto primitivo, por isso nao pode ser comparada no if diretamente, temos que usar equals
		if(((operacao.equals("+")) || (operacao.equals("-")) || (operacao.equals("/")) || (operacao.equals("*")))){
			if(operacao.equals("+")){
				resultado = valor1+valor2;
			}
			if(operacao.equals("-")){
				resultado = valor1-valor2;
			}
			if(operacao.equals("/")){
				resultado = valor1/valor2;
			}
			if(operacao.equals("*")){
				resultado = valor1*valor2;
			}
			System.out.println("Voce escolheu "+operacao+" para os valores "+valor1+" e "+valor2);
			System.out.println("O resultado foi: "+resultado);
		}else{
			System.out.println("Operador nao definido");
		}
		
	}

}
