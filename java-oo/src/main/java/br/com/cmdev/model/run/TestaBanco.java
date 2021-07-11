package br.com.cmdev.model.run;

import br.com.cmdev.model.Cliente;
import br.com.cmdev.model.Conta;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente calixto = new Cliente();
		calixto.setNome("Calixto Macedo");
		calixto.setCpf("002.998.002-78");
		calixto.setProfissao("Programador");
		
		Conta contaDoCalixto = new Conta(123, 365800);
		contaDoCalixto.deposita(1000);
		contaDoCalixto.setTitular(calixto);
		
		System.out.println(contaDoCalixto.getTitular().getNome());
		System.out.println(contaDoCalixto.getTitular());
		System.out.println(calixto);

	}

}
