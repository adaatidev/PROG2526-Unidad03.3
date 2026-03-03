package boletin01;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		 * entre 5 y 10 elementos ambos inclusive.
		 * -----------------------------------------------------------------------------
		 */

		Random rnd = new Random();

		ArrayList<Integer> valoresAleatorios = new ArrayList<>();

		int tamano = rnd.nextInt(5, 11);
		int numero;

		do {
			numero = rnd.nextInt(0, 101);
			valoresAleatorios.add(numero);
			tamano--;
		} while (tamano != 0);

	}

}