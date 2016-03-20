package methodo;

public class calcularSalario {

	private int salarioBruto;
	private double totalDesconto, salarioLiquido;

	public int calculaSalarioBruto(int hrsTrabalhadas, int valorHora) {

		salarioBruto = hrsTrabalhadas * valorHora;

		return salarioBruto;
	}

	public double calculaTotalDesconto(double vlrDesconto) {

		totalDesconto = vlrDesconto / 100 * salarioBruto;

		return totalDesconto;
	}

	public double calculaSalario() {

		salarioLiquido = salarioBruto - totalDesconto;

		return salarioLiquido;
	}
}
