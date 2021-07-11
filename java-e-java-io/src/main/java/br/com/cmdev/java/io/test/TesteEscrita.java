package br.com.cmdev.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		FileInputStream input = new FileInputStream("lorem.txt");

		//InputStreamReader reader = new InputStreamReader(input);
		Reader reader = new InputStreamReader(input);

		BufferedReader buffer = new BufferedReader(reader);

		String line = buffer.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = buffer.readLine();
		}
		buffer.close();

		String date = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssX:00").format(Calendar.getInstance().getTime());
		System.out.println(date);
	}
}

