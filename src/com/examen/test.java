package com.examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class test {
	
	private static String continuar;
	private static int izquierda;
	private static int derecha;

			
	public static void inicio() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadena inicial?");
		String cadenaTest = sc.next();
		char[] arreglo = cadenaTest.toCharArray();
		
		continuar = "s";
		while(continuar == "s") {

			System.out.println("Que letra deseas quitar?");
			String quitar = sc.next();
			
			char letra = quitar.charAt(0);
			
			System.out.println(arreglo.length);
			
			for (int i = 0; i < arreglo.length; i++) {
				if(letra == arreglo[i]) {
					arreglo[i] = ' ';
					izquierda = i + 2;
					derecha = (arreglo.length - 1) - i;
				}			
			}
			
			if(izquierda > derecha) {
				System.out.println("Derecha " + derecha);
				ordenarDer(arreglo);
			}else {
				System.out.println("Izquierda " + izquierda);
				ordenarIzq(arreglo);
			}
		
		}
		
	}
	
	private static void ordenarDer(char[] cadena) {
			System.out.println(cadena);
		}
		
	private static void ordenarIzq(char[] cadena) {
		System.out.println(cadena);		
	}

	private static void seguir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Continuar? s/n");
		String respuesta = sc.next();
		if(!respuesta.equals("s")) {
			continuar = "n";
		}
	}	
	
	
	
	public static void main(String[] args) {
		inicio();
	}
		
	
	
}