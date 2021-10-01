package com.examen;

import java.util.Scanner;

public class EjercicioB {

	public static void inicio() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el tamaño: ");
		int tamanhio = sc.nextInt();
		
		System.out.println("Ingresa la cadena: ");
		String cadena = sc.next();
		
		char[] caracteres = cadena.toCharArray();
		
		for (int y = 0; y < tamanhio; y++) {
			for (int z = 0; z < tamanhio; z++) {
				for (int i = 0; i < caracteres.length; i++) {
					for (int j = 0; j < tamanhio; j++) {
						System.out.print(caracteres[i] + " ");
					}
				}
				System.out.println("");
			}
		}
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		inicio();
	}

}
