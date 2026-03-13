package boletin01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores
		 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		 * ordenada. Pinta la colección por consola una vez rellena.
		 * -----------------------------------------------------------------------------
		 */

		Random rnd = new Random();

		ArrayList<Integer> listaOrdenada = new ArrayList<>();

		int numero;

		for (int i = 0; i < 30; i++) {
			numero = rnd.nextInt(1, 11);
			listaOrdenada.add(numero);
		}

		Collections.sort(listaOrdenada);

		System.out.println(listaOrdenada);

	}

}