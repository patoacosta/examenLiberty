package com.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void inicio() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el tamaño: ");
		int tamanhio = sc.nextInt();
		
		
		System.out.println("Ingresa la matriz: ");
		List<String> matriz = new ArrayList<String>();
		
		
		while(tamanhio != 0) {
			String cadena = sc.next();
			matriz.add(cadena);
			tamanhio--;
		}
		
		matriz.stream().map(T->{
            char[] datos = T.toCharArray();
            String a = "";
            for (int i = 0; i < datos.length; i++) {
                a = a + datos[i] + datos[i] + datos[i];
            }
            return a;
        }).forEach(T->{
        	for (int i = 0; i < 3; i++) {
        		System.out.println(T);
			}
        	
        });
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		inicio();
	}

}
