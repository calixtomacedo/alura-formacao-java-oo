package br.com.cmdev.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("writer.txt");
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("Calixto Rodrigues Macedo");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("Calixto Rodrigues Macedo 01");
		
		bufferedWriter.close();
	}

}
