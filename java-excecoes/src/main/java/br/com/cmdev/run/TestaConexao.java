package br.com.cmdev.run;

import br.com.cmdev.model.Conexao;

public class TestaConexao {

	public static void main(String[] args) {
	
		try (Conexao conexao = new Conexao()) {
			conexao.lerDados();
		} catch (Exception e) {
			System.out.println("Ocorreu erros na conexão: "+e);
		}
	}

}
