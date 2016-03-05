import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {

		int qnt_produto = 0, preco_custo[], preco_venda[], x = 0, y = 1, preco_custo_total = 0, preco_venda_total = 0, media_custo = 0, media_venda = 0,diferenca_valor = 0;
		
		preco_custo = new int[5];
		preco_venda = new int[5];
		
		//poderia declarar e instanciar direto
		//int vetor[] = new int[10];
		
		//o exercicio pede 40 produtos, colocamos 5 para facilitar e nao precisar de automacao
		
		//insere os valores
		while(qnt_produto < 5){
			
			System.out.println("Digite o preco de custo do produto "+y);
			Scanner entrada1 = new Scanner(System.in);
			preco_custo[x] = entrada1.nextInt();
			
			System.out.println("Digite o preco de venda do produto "+y);
			Scanner entrada2 = new Scanner(System.in);
			preco_venda[x] = entrada2.nextInt();
			
			x++;
			y++;
			qnt_produto++;
		}
		
		//zera o contador do vetor e while
		x = 0;
		y = 1;
		qnt_produto = 0;
		
		//imprime os valores inseridos
		while(qnt_produto < 5){
			
			System.out.println("O preco de custo do produto "+y+" e R$"+preco_custo[x]);
			
			System.out.println("O preco de venda do produto "+y+" e R$"+preco_venda[x]);
			
			x++;
			y++;
			qnt_produto++;
		}
		
		//zera o contador do vetor e while
		x = 0;
		y = 1;
		qnt_produto = 0;
		
		//calcula se teve lucro ou prejuizo
		while(qnt_produto < 5){
			
			preco_venda_total = preco_venda_total + preco_venda[x];
			preco_custo_total = preco_custo_total + preco_custo[x];
			
			x++;
			y++;
			qnt_produto++;
		}
		
		//imprime se teve lucro ou prejuizo
		
		diferenca_valor = preco_venda_total - preco_custo_total;
		
		if(preco_venda_total < preco_custo_total){
			System.out.println("Voce teve PREJUIZO de R$"+diferenca_valor);
		}
		else{
			System.out.println("Voce teve LUCRO de R$"+diferenca_valor);
		}
		
		//imprime a media dos valores de custo e venda
		//5 foi inserido manualmente como qnd de produtos totais
		media_custo = preco_custo_total / 5;
		media_venda = preco_venda_total / 5;
		
		System.out.println("A media de preco de CUSTO foi R$"+media_custo);
		System.out.println("A media de preco de VENDA foi R$"+media_venda);
	
	}

}
