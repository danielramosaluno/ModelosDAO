package com.senac.DAO;

import com.senac.interfaces.DAO;
import com.senac.modelos.Produto;

public class ProdutoDAO implements DAO<Produto>{
	private String TABELA_NOME = "produtos";
	
	@Override
	public String listar() {
		String sql = "SELECT id, nome, valor, quantidade FROM "+TABELA_NOME+" "
				+ "ORDER BY id DESC";
		return sql;
	}

	@Override
	public String cadastrar(Produto obj) {
		String sql = "INSERT INTO " + TABELA_NOME + "(nome, valor, quantidade) "
				+ "VALUES ("
				+ "'"+obj.getNome()+"',"
				+ obj.getValor()+", "
				+ obj.getQuantidade()+")";
		return sql;
	}

	@Override
	public String editar(Produto obj) {
		String sql = "UPDATE "+TABELA_NOME+" SET "
				+ "nome = '" + obj.getNome()+"', "
				+ "quantidade = " + obj.getQuantidade()+", "
				+ "valor = " + obj.getValor()+" "
				+ "WHERE id = " + obj.getId();
		return sql;
	}

	@Override
	public String excluir(Produto obj) {
		String sql = "DELETE FROM " + TABELA_NOME + " WHERE id = "+obj.getId();
		return sql;
	}

	@Override
	public String buscaPorId(int id) {
		String sql = "SELECT id, nome, valor, quantidade WHERE id="+id;
		return sql;
	}

}
