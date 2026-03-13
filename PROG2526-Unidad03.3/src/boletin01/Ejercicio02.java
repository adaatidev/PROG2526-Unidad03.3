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
		int suma = 0;
		int media = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		for (int i = 0; i < tamano; i++) {
			numero = rnd.nextInt(0, 101);
			valoresAleatorios.add(numero);
			suma += numero;
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}
		}

		media = suma / tamano;

		System.out.println(valoresAleatorios);
		System.out.println("Suma total: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + maximo);
		System.out.println("Mínimo: " + minimo);
	}

}