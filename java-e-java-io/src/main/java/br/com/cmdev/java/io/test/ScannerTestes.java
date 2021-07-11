package br.com.cmdev.java.io.test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTestes {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("conta.csv"), StandardCharsets.UTF_8);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			//System.out.println(line);
			
			Scanner scLine = new Scanner(line);
			scLine.useLocale(Locale.US);			
			scLine.useDelimiter(",");
			
			String tipoConta = scLine.next();
			int agencia = scLine.nextInt();
			int conta = scLine.nextInt();
			String titular = scLine.next();
			double saldo = scLine.nextDouble();
			
			DecimalFormat format = new DecimalFormat("R$###,###.###");
			
			String valoresFormatado = String.format(new Locale("pt", "BR"), "Tipo: %s, Conta: %04d-%08d, Titular: %s, %s", tipoConta, agencia, conta, titular, format.format(saldo));
			System.out.println(valoresFormatado);
			
			//System.out.println("Tipo: ".concat(tipoConta).concat(", Agencia: ".concat(String.valueOf(agencia)).concat(", Conta: ").concat(String.valueOf(conta)).concat(", Titular: ").concat(titular).concat(", Saldo: ").concat(String.valueOf(saldo))));
			
			scLine.close();
			
			/*
			String[] valores = line.split(",");
			System.out.println(Arrays.toString(valores));
			System.out.println(valores[3]);
			*/
		}
		scanner.close();
	}
}
