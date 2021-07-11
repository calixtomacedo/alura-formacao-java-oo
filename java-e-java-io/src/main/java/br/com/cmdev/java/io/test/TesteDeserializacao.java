package br.com.cmdev.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.cmdev.java.io.domain.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
	}

}
