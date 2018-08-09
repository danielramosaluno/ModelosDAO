package com.senac.florianopolis.exemplos;

public class Cachorro {
	private String Raca;

	public Cachorro(String raca) {
		super();
		Raca = raca;
	}

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
	}

	@Override
	public String toString() {
		return "Cachorro [Raca=" + Raca + "]";
	}
	

}
