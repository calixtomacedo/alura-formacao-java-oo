package br.com.cmdev.javaejavautil.model;

public class ListaDeObject {
	
	private Object[] referencias;
	private int posisao;

	public ListaDeObject() {
		this.referencias = new Object[10];
		this.posisao = 0;
	}

	public void adiciona(Object ref) {
		this.referencias[this.posisao] = ref;
		this.posisao++;
	}

	public int getTamanhoDaLista() {
		return this.posisao;
	}

	public Object getReferencia(int position) {
		return this.referencias[position];
	}

}
