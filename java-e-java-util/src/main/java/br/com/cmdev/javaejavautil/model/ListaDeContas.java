package br.com.cmdev.javaejavautil.model;

public class ListaDeContas {

	private Conta[] referencias;
	private int posisao;

	public ListaDeContas() {
		this.referencias = new Conta[10];
		this.posisao = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posisao] = ref;
		this.posisao++;
	}

	public int getTamanhoDaLista() {
		return this.posisao;
	}

	public Conta getReferencia(int position) {
		return this.referencias[position];
	}
}
