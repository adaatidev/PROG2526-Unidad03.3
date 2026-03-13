package boletin01;

import java.util.TreeSet;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DE CONJUNTO
		TreeSet<String> listaNombres = new TreeSet<>();

		// VARIABLE AUXILIAR
		String nombre = "";

		System.out.println("Introduzca nombres (escribe 'fin' para terminar): ");

		// SE ALMACENAN NOMBRES MIENTRAS QUE NO SE INTRODUZCA FIN
		do {
			System.out.print("> ");
			nombre = sc.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}
			listaNombres.add(nombre);
		} while (!nombre.equals("fin"));

		// IMPRIME EL CONJUNTO
		System.out.println(listaNombres);

		sc.close();
	}

}
