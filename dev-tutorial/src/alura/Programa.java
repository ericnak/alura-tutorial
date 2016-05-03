package alura;

public class Programa {

	public static void main(String[] args) {
		Funcionario fulano = new Funcionario();
		fulano.nome = "Fulano da Silva";
		fulano.departamento = "TI";
		fulano.dataEntrada = "01/08/2011";
		fulano.rg = "123.456-7";
		fulano.salario = 1000;
		
		Funcionario ciclano = new Funcionario();
		ciclano.nome = "Ciclano da Silva";
		ciclano.departamento = "Sales";
		ciclano.dataEntrada = "01/09/2011";
		ciclano.rg = "123.456-7";
		ciclano.salario = 2000;
		
		System.out.println(fulano.salario);
		System.out.println(ciclano.salario);
	}

}
