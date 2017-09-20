package pt.com.altran.servlet;

public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	 int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.15 + 1000;
		// return super.getBonificacao();
	}

}
