import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {

	int numero_dig;
	
	System.out.println("Digite um numero de 1 a 5:");
	Scanner entrada1 = new Scanner(System.in);
	numero_dig = entrada1.nextInt();
	
	if(numero_dig == 5){
		System.out.println("O numero digitado foi CINCO");
	}
	if(numero_dig == 4){
		System.out.println("O numero digitado foi QUATRO");
	}
	if(numero_dig == 3){
		System.out.println("O numero digitado foi TRES");
	}
	if(numero_dig == 2){
		System.out.println("O numero digitado foi DOIS");
	}
	if(numero_dig == 1){
		System.out.println("O numero digitado foi UM");
	}
	else{
		System.out.println("Voce nao digitou um numero dentro do intervalo solicitado");
	}
		
	}

}
