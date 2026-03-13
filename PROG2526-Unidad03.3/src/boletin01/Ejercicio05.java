package boletin01;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
		 * que se insertarán en una colección, de forma que se conserve el orden de
		 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
		 * pantalla.
		 * -----------------------------------------------------------------------------
		 */

		Scanner sc = new Scanner(System.in);

		LinkedHashSet<String> listaNombres = new LinkedHashSet<>();

		String nombre = "";

		do {
			System.out.println("Introduzca un nombre: ");
			nombre = sc.nextLine();
			listaNombres.add(nombre);

		} while (!nombre.equals("fin"));

		listaNombres.remove("fin");

		System.out.println(listaNombres);

		sc.close();

	}

}