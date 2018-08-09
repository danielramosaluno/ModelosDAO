package com.senac.interfaces;

public interface DAO<E> {
	
	public String listar();
	public String cadastrar(E obj);
	public String editar(E obj);
	public String excluir(E obj);
	public String buscaPorId(int id);

}
