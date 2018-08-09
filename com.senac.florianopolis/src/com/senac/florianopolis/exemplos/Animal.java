package com.senac.florianopolis.exemplos;

public class Animal {
	private String Nome;
	private int Idade;
	private Long Longitude;
	private boolean Fome;
	
		public Animal() {
		super();
	
	}

		public Animal(String nome, int idade, Long longitude, boolean fome) {
		super();
		Nome = nome;
		Idade = idade;
		Longitude = longitude;
		Fome = fome;
	}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public int getIdade() {
			return Idade;
		}

		public void setIdade(int idade) {
			Idade = idade;
		}

		public Long getLongitude() {
			return Longitude;
		}

		public void setLongitude(Long longitude) {
			Longitude = longitude;
		}

		public boolean isFome() {
			return Fome;
		}

		public void setFome(boolean fome) {
			Fome = fome;
		}

		@Override
		public String toString() {
			return "Animal [Nome=" + Nome + ", Idade=" + Idade + ", Longitude=" + Longitude + ", Fome=" + Fome + "]";
		}
	
	

}
