package com.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioD {

	static int a;
	static int b;
	static int c;
	static int d;
	static int z;
	static int ast;
	
	public static void inicio() {
		
		obtenerDatos();	
	}
	
	private static void obtenerDatos() {
		Integer tipos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la poblacion: ");
		String poblado = sc.next();
		System.out.println("Ingreseel registro de cultivos: ");
		String registro = sc.next();
		char[] cadena = registro.toCharArray();
		
		conteo(cadena);
		tipos = tiposExistentes(cadena);
		
		imprimirFormato(poblado, tipos);
		sc.close();
	}
	
	static void conteo(char[] cadena) {

		for(Character tipo : cadena) {
			if(tipo.equals('a')) {
				a++;
			}else if(tipo.equals('b')) {
				b++;
			}else if(tipo.equals('c')) {
				c++;
			}else if(tipo.equals('d')) {
				d++;
			}else if(tipo.equals('z')) {
				z++;
			}else { 
				ast++;
			}
		}			
	}
	
	private static Integer tiposExistentes(char[] cadena) {
		List<Character> nuevaLista = new ArrayList<Character>();
		
		for(Character tipo : cadena) {
			if(!nuevaLista.contains(tipo)) {
				nuevaLista.add(tipo);
			}
		}
		return nuevaLista.size();
		
	}
	
	
	static void imprimirFormato(String poblado, Integer tipos) {
		System.out.println("POBLACION: " + poblado +
				"\nTIPOS DE CULTIVOS: " + tipos +
				"\nDESCONOCIDOS: " + ast +
				"\nCANTIDADES: " +
				"\na - " + a +
				"\nb - " + b +
				"\nz - " + z + 
				"\nc - " + c +
				"\nd - " + d		
				);
	}
	
	
	public static void main(String[] args) {
		inicio();
	}
	
}
