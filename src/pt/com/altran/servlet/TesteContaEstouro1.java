package pt.com.altran.servlet;

public class TesteContaEstouro1 {
	public static void main(String args[]) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 300.0;
		minhaConta.limite = 200.0;
		//minhaConta.saca(50000);
		
		double novoSaldo = -50;
		if (novoSaldo< minhaConta.limite) {
			System.out.println("Não posso mudar para esse saldo");
			System.out.println(minhaConta.saldo);
		}else {
			minhaConta.saldo=novoSaldo;
			System.out.println(minhaConta.saldo);
		}
		
		System.out.println("Saldo actual"+minhaConta.saldo);
		System.out.println(minhaConta.deposita(300));
		System.out.println("Saldo actual"+minhaConta.saldo);
		minhaConta.saca(100);
		System.out.println("Saldo actual"+minhaConta.saldo);
	}
}