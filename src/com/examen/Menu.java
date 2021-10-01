package com.examen;

import java.util.Scanner;


public class Menu{

	public static void main(String[] args) {
		EjercicioA ejercicioA = new EjercicioA();
		EjercicioB ejercicioB = new EjercicioB();
		EjercicioC ejercicioC = new EjercicioC();
		EjercicioD ejercicioD = new EjercicioD();
		EjercicioE ejercicioE = new EjercicioE();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el numero del ejercicio a probar: \n"
				+ "1.Juego de Pi\n"
				+ "2.Topo ciego\n"
				+ "3.Total de Pi's\n"
				+ "4.El agricultor*\n"
				+ "5.El estacionamiento*\n");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:
			ejercicioA.inicio();
			break;
		case 2:
			ejercicioB.inicio();
			break;
		case 3:
			ejercicioC.inicio();
			break;
		case 4:
			ejercicioD.inicio();
			break;
		case 5:
			ejercicioE.inicio();
			break;	
		default:
			break;
		}
		
		scanner.close();
		
	}

}
