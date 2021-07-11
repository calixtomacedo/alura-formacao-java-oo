package br.com.cmdev.javaejavautil.run;

import br.com.cmdev.javaejavautil.model.Conta;
import br.com.cmdev.javaejavautil.model.ContaCorrente;
import br.com.cmdev.javaejavautil.model.ListaDeObject;

public class ListaDeObjectTest {

	public static void main(String[] args) {

		ListaDeObject lista = new ListaDeObject();
		
		ContaCorrente conta22 = new ContaCorrente(222, 123456789);
		
		ContaCorrente conta33 = new ContaCorrente(333, 987456321);
		
		lista.adiciona(conta22);
		lista.adiciona(conta33);
		
		int tamanho = lista.getTamanhoDaLista();
		System.out.println("Tamanho da lista: "+tamanho);
		
		Conta ref = (Conta) lista.getReferencia(1);
		System.out.println("Referencia: "+ref.getNumero());
		
	}

}
