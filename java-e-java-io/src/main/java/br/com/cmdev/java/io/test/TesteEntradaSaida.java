package br.com.cmdev.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEntradaSaida {
	
	
	 public static void main(String[] args) throws IOException {

         @SuppressWarnings("resource")
		Socket socket = new Socket();

         InputStream fis = socket.getInputStream(); //System.in; //new FileInputStream("lorem.txt");
         Reader isr = new InputStreamReader(fis);
         BufferedReader br = new BufferedReader(isr);

         OutputStream fos = socket.getOutputStream(); //System.out; //new FileOutputStream("lorem2.txt");
         Writer osw = new OutputStreamWriter(fos);
         BufferedWriter bw = new BufferedWriter(osw);

         String linha = br.readLine();

         while(linha != null && !linha.isEmpty()) {

             bw.write(linha);
             bw.newLine();
             bw.flush();
             linha = br.readLine();
         }

         br.close();
         bw.close();

 }

}
