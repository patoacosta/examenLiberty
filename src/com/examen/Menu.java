package com.examen;

import java.util.Scanner;


public class Menu{

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:
			EjercicioA ejercicioA = new EjercicioA();
			break;
		case 2:
			System.out.println("Opcion 2");
		default:
			break;
		}
		
		scanner.close();
		
	}

}
