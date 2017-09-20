package pt.com.altran.servlet;

public class Conta {
	 int numero;
	 Cliente titular;
	  double saldo;
	  double limite;
	 double deposita;
	 double saca;

	 Conta(Cliente titular){
		 this.titular=titular;
		 System.out.println("Construimos uma conta");
	 }
	 
	 
	 
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	void saca(double quantidade) {
		this.saldo = this.saldo - quantidade;
	}
	public double pegaSaldo() {
		return this.saldo;
	}

	public double deposita(double deposita)
	{
		this.saldo = saldo + deposita;
		return saldo;
	}

}
