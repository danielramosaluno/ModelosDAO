package com.senac.modelos;

public class Funcionario {
	private int id;
	private String nome;
	private String funcao;
	private int idade;
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcionario(int id, String nome, String funcao, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return id + "nome"+ idade;
	}

	
}
