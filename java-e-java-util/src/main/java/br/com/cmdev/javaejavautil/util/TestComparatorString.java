package br.com.cmdev.javaejavautil.util;

import java.util.ArrayList;
import java.util.Collections;

import br.com.cmdev.javaejavautil.exceptions.CMDEVException;
import br.com.cmdev.javaejavautil.model.Cliente;
import br.com.cmdev.javaejavautil.model.Conta;
import br.com.cmdev.javaejavautil.model.ContaCorrente;
import br.com.cmdev.javaejavautil.model.ContaPoupanca;

public class TestComparatorString {

	public static void main(String[] args) throws CMDEVException {
		
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);
        
        ArrayList<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta+", "+conta.getTitular().getNome());
		}
		
		System.out.println("\n");
		
		//lista.sort(new TitularContasComparator());
		
		//lista.sort(null);
		
		//Collections.sort(lista, new TitularContasComparator());
		
		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta+", "+conta.getTitular().getNome());
		}
	}

}
