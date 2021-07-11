package br.com.cmdev.javaejavautil.run;

import java.util.ArrayList;

public class TestLambida {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((numero) -> {
			System.out.println(numero);
		});
	}

}
