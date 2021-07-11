package br.com.cmdev.javaejavalang.run;

import java.sql.SQLException;
import java.util.List;

import cmdev.alura.java.jdbc.dao.ProdutoDAO;
import cmdev.alura.java.jdbc.domain.Produto;

public class TestaBiblioteca {

	public static void main(String[] args) throws SQLException, Exception {
		List<Produto> listar = ProdutoDAO.getInstance().listar();
		
		for (Produto produto : listar) {
			System.out.println(produto.getIdProduto());
			System.out.println(produto.getNmProduto());
		}
	}

}
