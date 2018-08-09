package com.senac.florianopolis.exemplos;

public class Cavalo extends Animal {
	private String Raca;

	public Cavalo(String raca) {
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
		return "Cavalo [Raca=" + Raca + "]";
	};
	
}
