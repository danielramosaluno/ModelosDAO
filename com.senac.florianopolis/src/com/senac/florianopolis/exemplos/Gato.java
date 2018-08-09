package com.senac.florianopolis.exemplos;

public class Gato {
	private Cor cor;
	private boolean Preto;
	public Gato(Cor cor, boolean preto) {
		super();
		this.cor = cor;
		Preto = preto;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public boolean isPreto() {
		return Preto;
	}
	public void setPreto(boolean preto) {
		Preto = preto;
	}
	@Override
	public String toString() {
		return "Gato [Preto=" + Preto + "]";
	}
	
	
}
