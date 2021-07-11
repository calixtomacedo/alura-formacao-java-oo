package br.com.cmdev.java.io.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializacaoTeste {

	public static void main(String[] args) throws Exception {
		
		/*
		String nome = "Calixto Rodriguês Macedo";

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		outputStream.writeObject(nome);
		outputStream.close();
		*/
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) inputStream.readObject();
		inputStream.close();
		
		System.out.println(nome);
	}

}
