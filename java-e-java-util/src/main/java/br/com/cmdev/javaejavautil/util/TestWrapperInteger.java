package br.com.cmdev.javaejavautil.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		System.out.println(idades[0]);
		
		String[] nomes = new String[5];
		System.out.println(nomes[0]);
		
		int idade = 48;
		
		Integer idadeRef = Integer.valueOf(48); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
		
		System.out.println(numeros.get(0));
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
	}

}
