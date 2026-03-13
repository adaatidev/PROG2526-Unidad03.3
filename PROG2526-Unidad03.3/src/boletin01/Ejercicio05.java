package boletin01;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DEL CONJUNTO
		LinkedHashSet<String> listaNombres = new LinkedHashSet<>();

		// VARIABLE AUXILIAR
		String nombre = "";

		System.out.println("Introduzca nombres (escribe 'fin' para terminar):");

		// SE ALMACENAN NOMBRES MIENTRAS QUE NO SE INTRODUZCA FIN
		do {
			System.out.print("> ");
			nombre = sc.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}
			listaNombres.add(nombre);
		} while (!nombre.equals("fin"));

		// IMPRIME CONJUNTO
		System.out.println(listaNombres);

		sc.close();
	}

}
