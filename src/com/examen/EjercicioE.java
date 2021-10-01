package com.examen;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioE {
	

	private static String continuar;
	private static Integer izquierda;
	private static Integer derecha;
	private static Character letra;
	private static Integer letraIndex;	
	private static List<Character> nuevaLista = new ArrayList<Character>();

	public static void inicio() {
		ingresarDatos();

	}
	
	static void ingresarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadena inicial?");
		String cadenaInicial = sc.next();
		
		quitarLetra(cadenaInicial);
		
	}
	
	static void quitarLetra(String cadena) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que letra deseas quitar?");
		letra = sc.next().charAt(0);	
		
		char[] arreglo = cadena.toCharArray();
		
		rutaMasCorta(arreglo);
	
		for(Character caracter : arreglo) {
			if(caracter != letra) {
				nuevaLista.add(caracter);
			}
		}
		
		System.out.println(nuevaLista);
		
		if(izquierda > derecha) {
			System.out.println("Derecha " + derecha);
			ordenarDer(nuevaLista);
		}else {
			System.out.println("Izquierda " + izquierda);
			ordenarIzq(nuevaLista);
		}
		
		

	}
	
	
	static void rutaMasCorta(char[] arreglo) {
		
		for (int i = 0; i < arreglo.length; i++) {
			if(letra == arreglo[i]) {
				letraIndex = i;
				izquierda = i ;
				derecha = (arreglo.length - 1) - i;
			}			
		}
		
		
	}
	
	
	static void ordenarDer(List<Character> listaDesOrd) {
		List<Character> listaOrdenada = new ArrayList<Character>();
				
		for (int i = 0; i < letraIndex; i++) {
			listaOrdenada.add(listaDesOrd.get(i));
		}
		
		for (int i = listaDesOrd.size()-1; i > letraIndex - 1 ; i--) {
			listaOrdenada.add(listaDesOrd.get(i));
		}
		
		System.out.println(listaOrdenada);
		
	}
	
	
	static void ordenarIzq(List<Character> listaDesOrd) {
		List<Character> listaOrdenada = new ArrayList<Character>();
		
		for (int i = letraIndex - 1; i >= 0 ; i--) {
			listaOrdenada.add(listaDesOrd.get(i));
		}
		
		for (int i = letraIndex; i < listaDesOrd.size(); i++) {
			listaOrdenada.add(listaDesOrd.get(i));
		}
		
		
		
		System.out.println(listaOrdenada);
	}
			
		
	
	public static void main(String[] args) {
		inicio();
	}
		
	
	
}