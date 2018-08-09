package com.senac.florianopolis.exemplos;

import java.util.Arrays;

public class Cor {
	private String nome;
	private String hexadecimal;
	private static int red = 0;
	private static int green = 1;
	private static int  blue = 3;
	private int []rgb;
	public Cor(String nome, String hexadecimal, int[] rgb) {
		super();
		this.nome = nome;
		this.hexadecimal = hexadecimal;
		this.rgb = rgb;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHexadecimal() {
		return hexadecimal;
	}
	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
	public static int getRed() {
		return red;
	}
	public static void setRed(int red) {
		Cor.red = red;
	}
	public static int getGreen() {
		return green;
	}
	public static void setGreen(int green) {
		Cor.green = green;
	}
	public static int getBlue() {
		return blue;
	}
	public static void setBlue(int blue) {
		Cor.blue = blue;
	}
	public int[] getRgb() {
		return rgb;
	}
	public void setRgb(int[] rgb) {
		this.rgb = rgb;
	}
	public void setRgb (int r,int g,int b){
		
		this.rgb[Cor.red] = r;
		this.rgb[Cor.green]= g;
		this.rgb[Cor.blue] = b;
		
	
 	}
	
	
	@Override
	public String toString() {
		return "Cor [nome=" + nome + ", hexadecimal=" + hexadecimal + ", rgb=" + Arrays.toString(rgb) + "]";
	}
	
}
	