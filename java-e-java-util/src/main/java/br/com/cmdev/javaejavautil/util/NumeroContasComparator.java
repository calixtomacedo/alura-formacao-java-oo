package br.com.cmdev.javaejavautil.util;

import java.util.Comparator;

import br.com.cmdev.javaejavautil.model.Conta;

public class NumeroContasComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
		/*
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;
		*/
	}

}
