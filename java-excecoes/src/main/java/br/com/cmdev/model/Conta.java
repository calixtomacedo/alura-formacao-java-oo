package br.com.cmdev.model;

import br.com.cmdev.exceptions.CMDEVException;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
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
		if (agencia <= 0) {
			System.out.println("Impossivel criar uma conta com valor agencia negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
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

	public abstract void deposita(double valor) throws CMDEVException;

	public void saca(double valor) throws CMDEVException {
		if (this.saldo < valor) {
			throw new CMDEVException("Saldo: "+ this.saldo +", Valor solicitado: "+ valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta contaDestino) throws CMDEVException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}

	public static int getTotal() {
		return Conta.total;
	}

}
