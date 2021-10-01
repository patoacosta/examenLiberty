package com.examen;

import java.util.Scanner;

public class Pi {
	public void capturaDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero");
		String numeroIngresado = sc.next();
		
		procesaDatos(numeroIngresado);
		sc.close();
	}
	
	private void procesaDatos(String numero) {
		Boolean contiene = contieneSiete(numero);
		Integer suma = sumaSiete(numero);
		
		if(Integer.parseInt(numero) % 7 == 0 || contiene == true || suma == 7) {
			System.out.println("pi");
		}else {
			System.out.println(numero);
		}
		salidaDatos();
	}
	
	
	private Boolean contieneSiete(String numero) {
		
		if(numero.contains("7")) {
			return true;
		}
		return false;		
	}
	
	private Integer sumaSiete(String numero) {
		char[] digitos = numero.toCharArray();
		int suma = 0;
		
		for (int i = 0; i < digitos.length; i++) {
			suma = suma + Character.getNumericValue(digitos[i]);
		}
		
		return suma;
	}
	
	
	
	private void salidaDatos() {
		System.out.println("Desea ingresar otro numero? s/n");
		Scanner sc = new Scanner(System.in);
		String respuesta = sc.next();
		
		if(respuesta.equals("s")) {
			capturaDatos();
		}
		sc.close();
		
	}
	
	
	
}

