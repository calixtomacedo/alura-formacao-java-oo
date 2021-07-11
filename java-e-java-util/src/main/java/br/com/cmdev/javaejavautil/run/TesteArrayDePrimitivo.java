package br.com.cmdev.javaejavautil.run;

public class TesteArrayDePrimitivo {

	public static void main(String[] args) {

		int[] idades = new int[5];
		
		/*
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		System.out.println(idades[2]);
		
		System.out.println(idades.length);
		*/
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for (int idade : idades) {
			System.out.println(idade);
		}
		
		
		int[] ref = {5, 4, 3, 2, 1, 0};
		for (int i : ref) {
			System.out.println(i);
		}
		
	}

}
