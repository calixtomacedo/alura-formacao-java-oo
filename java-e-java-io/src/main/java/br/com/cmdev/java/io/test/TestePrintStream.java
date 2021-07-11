package br.com.cmdev.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStream {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream printStream = new PrintStream(new File("printStream.txt"));
		
		PrintWriter printWriter = new PrintWriter(new File("printWriter.txt"));
		
		printStream.print("Calixto Rodrigues Macedo 01");
		printStream.println();
		printStream.println();
		printStream.print("Calixto Rodrigues Macedo 02");
		printStream.close();
		
		
		printWriter.print("Calixto Rodrigues Macedo printWriter 01");
		printWriter.println();
		printWriter.println();
		printWriter.print("Calixto Rodrigues Macedo printWriter 02");
		printWriter.close();
	}

}
