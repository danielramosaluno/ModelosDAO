package com.senac.DAO;

import com.senac.interfaces.DAO;
import com.senac.modelos.Funcionario;

public class FuncionarioDAO implements DAO<Funcionario> {
	private String TABELA_NOME = "funcionarios";
	@Override
	public String listar() {
		String sql = "SELECT id, nome, funcao, idade FROM "+TABELA_NOME+" "
				+ "ORDER BY id DESC";
		return sql;
	}

	@Override
	public String cadastrar(Funcionario obj) {
		String sql = "INSERT INTO"+ TABELA_NOME+ "(nome,funcao,idade)"
				+ "values ("
				+"'"+ obj.getNome()+"',"
				+"'"+ obj.getFuncao()+"',"
				+ obj.getIdade()+")";
		return sql;
	}

	@Override
	public String editar(Funcionario obj) {
		String sql = "UPDATE"+ TABELA_NOME +"SET"
				+"nome = '" + obj.getNome() + "', "
				+"funcao = '"+obj.getFuncao() + "', "
				+"idade = " + obj.getIdade() + " "
				+"WHERE id = " + obj.getId();
				
		return sql;
	}

	@Override
	public String excluir(Funcionario obj) {
		String sql = "DELETE FROM " + TABELA_NOME + " WHERE id = "+obj.getId();
		return null;
	}

	@Override
	public String buscaPorId(int id) {
		String sql = "SELECT id, nome, valor, quantidade WHERE id="+id;
		return null;
	}

}
