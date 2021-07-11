package br.com.cmdev.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiandoArquivo {

	public static void main(String[] args) throws IOException {

		FileInputStream input = new FileInputStream("lorem.txt");
		Reader reader = new InputStreamReader(input);
		BufferedReader bufferReader = new BufferedReader(reader);
		String line = bufferReader.readLine();
		
		FileOutputStream output = new FileOutputStream("lorem3.txt");
		Writer writer = new OutputStreamWriter(output);
		BufferedWriter bufferWriter = new BufferedWriter(writer);
		
		while (line != null && !line.isEmpty()) {
			bufferWriter.write(line);
			bufferWriter.newLine();
			line = bufferReader.readLine();
		}
		bufferReader.close();
		bufferWriter.close();
	}

}

