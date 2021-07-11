package br.com.cmdev.model;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	//public String titular;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("Total: "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma nova conta "+ this.numero);
	}

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Impossivel criar uma conta com valor agencia negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Impossivel criar uma conta com valor numero negativo");
			return;
		}
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
