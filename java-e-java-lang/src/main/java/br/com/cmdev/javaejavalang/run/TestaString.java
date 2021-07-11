package br.com.cmdev.javaejavalang.run;

public class TestaString {

	public static void main(String[] args) {

		String nome = "Alura"; // object literal
		// String name = new String("Alura");
		
		String vazio = " ";

		String nomeReplace = nome.replace("Al", "LA");
		
		
		char charAt = nome.charAt(2);
		
		int indexOf = nome.indexOf("ur");
		
		String substring = nome.substring(1, 3);
		
		boolean empty = vazio.isEmpty();
		System.out.println(empty);
		
		boolean blank = vazio.isBlank();
		System.out.println(blank);

		System.out.println(nome);
		System.out.println(nomeReplace);
		System.out.println(charAt);
		System.out.println(indexOf);
		System.out.println(substring);
	}

}
