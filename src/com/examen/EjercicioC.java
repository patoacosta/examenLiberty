package com.examen;

import java.util.Scanner;

public class EjercicioC{
		
	public static void inicio() {

		boolean contiene = false;			
		int sumaDigitos = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa un numero entero positivo entre 1 y 100:");
		int numeroRecibido = scanner.nextInt();
		int contador = 0;

		
		if(numeroRecibido > 0 && numeroRecibido < 101) {
			
			for (int i = 1; i <= (numeroRecibido * numeroRecibido); i++) {
				char[] digitos = String.valueOf(i).toCharArray();
				
				contiene = buscarDigito(digitos);
				sumaDigitos = sumar(digitos);
				
				if (i % 7 == 0 || contiene == true || sumaDigitos == 7) {
//					Impresiones para mostrar la cadena completa: {1 2 3 4 5 6 pi 8 9 10 11 12 13 pi 15 pi pi 18 19 20 pi 22 23 24 pi 26 pi pi 29 30 31 32 33 pi pi 36 }
//					System.out.print("pi ");
					contador++;
				}else {
//					System.out.print(i + " ");
				}
				
			}
			
		}else {
			System.out.println("Numero fuera del rango. Intentelo de nuevo.");
		}
		
		System.out.println("\nEl total de \"Pi's\" entre 1 y " + (numeroRecibido*numeroRecibido) +  " son " + contador);
		scanner.close();
	}

	
		public static boolean buscarDigito(char[] digitos) {
			boolean contiene = false;
			for(int i = 0; i < digitos.length; i++) {
				if(digitos[i] == '7') {
					contiene = true;
				}
			}
			return contiene;
		}
		
		
		public static int sumar(char[] digitos){
			int suma = 0;
			for (int i = 0; i < digitos.length; i++) {
				suma = suma + Character.getNumericValue(digitos[i]);
			}
			return suma;
		}
		
		public static void main(String[] args) {
			inicio();
		}

}