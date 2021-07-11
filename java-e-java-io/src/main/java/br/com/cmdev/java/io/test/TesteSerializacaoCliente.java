package br.com.cmdev.java.io.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.cmdev.java.io.domain.Cliente;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws Exception {
		/*
		Cliente cliente = new Cliente();
		cliente.setNome("Calixto Macedo");
		cliente.setCpf("897254889334");
		cliente.setProfissao("Analista de Sistemas");

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		outputStream.writeObject(cliente);
		outputStream.close();
		 */

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) inputStream.readObject();
		inputStream.close();
	

		System.out.println(cliente.getNome()+", "+cliente.getCpf()+", "+cliente.getProfissao());
	}

}
