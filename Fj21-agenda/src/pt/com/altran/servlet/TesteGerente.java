package pt.com.altran.servlet;

public class TesteGerente {
	public static void main(String[] args) {
		// criar objecto gerente
		Gerente gerente = new Gerente();
		gerente.setNome("Filipe");
		gerente.setSalario(5000);
		System.out.println("Ordenado do gerente: " + gerente.getBonificacao());

		// Polimorfismo
		Gerente pgerente = new Gerente();
		Funcionario funcionario = pgerente;
		funcionario.setSalario(5000);
		funcionario.getBonificacao();
		System.out.println(
				"Valor funcionario mas vai buscar o salario do gerenet (Polimorfismo)" + funcionario.getBonificacao());

		// Controle
		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(1000);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(575);
		controle.registra(funcionario2);

		System.out.println("Valor de bonificações " + controle.getTotalDeBonificacoes());

	}
}
