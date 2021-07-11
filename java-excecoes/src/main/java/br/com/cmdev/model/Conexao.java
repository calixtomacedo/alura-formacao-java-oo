package br.com.cmdev.model;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo a conexão");
	}

	public void lerDados() throws Exception {
		//System.out.println("Recebendo dados");
		//throw new IllegalStateException();
	    lancaException();
	}
	
	public void lancaException() throws Exception {
	    try {
		System.out.println("Chamou o lancaException ");
		int i = 500 / 0; 
		System.out.println(i);
	    } catch (Exception e) {
		throw new Exception(e);
	    }
	}
	
	@Override
	public void close() {
		System.out.println("Fechando a conexão");
	}
}
