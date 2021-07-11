package br.com.cmdev.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		FileOutputStream output = new FileOutputStream("lorem2.txt");

		Writer writer = new OutputStreamWriter(output);

		BufferedWriter buffer = new BufferedWriter(writer);

		String str = "Meu nome é Calixto Rodrigues Macedo";
		buffer.write(str);
		buffer.newLine();
		buffer.newLine();
		buffer.write("O melhor time do mundo é o Coringão");
		buffer.close();

	}

}

