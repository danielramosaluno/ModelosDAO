package com.senac.view;

import javax.swing.JOptionPane;

public class Painel {

	
	public static String input(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public static String input(String msg, String defaultValue){
		return JOptionPane.showInputDialog(msg, defaultValue);
	}
	
	public static int inputInt(String msg){
		return Integer.parseInt(Painel.input(msg));
	}
	
	public static int inputInt(String msg, String defaultValue){
		return Integer.parseInt(Painel.input(msg, defaultValue));
	}
	
	public static double inputDouble(String msg){
		return Double.parseDouble(Painel.input(msg));
	}
	
	public static double inputDouble(String msg, String defaultValue){
		return Double.parseDouble(Painel.input(msg, defaultValue));
	}
	
	public static void show(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	

}





