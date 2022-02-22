package br.senac.pr;

public class Conta {
	
	int numero;
	float saldo;
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	

	public String retornaConta() {
		// TODO Auto-generated method stub
		return "[Numero: " + this.numero + " - Saldo: " + this.saldo + "]";
	}
	
	public boolean debitaSaldo(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
			}
		return false;
	}
	
	public void creditaSaldo(float valor) {
		this.saldo += valor;
	}

}
