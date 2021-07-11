package br.com.cmdev.javaejavautil.run;

public class TestArrayString {

	public static void main(String[] args) {
		System.out.println("Passou aqui!");
		
		for (String string : args) {
		    System.out.println("Passou aqui! = "+ string);
		}
	}

}
