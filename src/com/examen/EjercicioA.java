package com.examen;

import java.util.Scanner;

public class EjercicioA{
		
	public static void inicio() {

		boolean contiene = false;			
		int sumaDigitos = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa un numero entero positivo:");
		int numeroRecibido = scanner.nextInt();
		
		char[] digitos = String.valueOf(numeroRecibido).toCharArray();
	
		contiene = buscarDigito(digitos);
		sumaDigitos = sumar(digitos);
		
		if (numeroRecibido % 7 == 0 || contiene == true || sumaDigitos == 7) {
			System.out.println("pi");
		}else {
			System.out.println(numeroRecibido);
		}
		
		System.out.println("\nAplicacion finalizada...");
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